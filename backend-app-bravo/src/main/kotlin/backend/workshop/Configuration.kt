package backend.workshop

@Profile("initlocal")
@Configuration
@EnableWebSecurity
class OpenSecurityConfiguration : WebSecurityConfigurerAdapter() {
    @Throws(Exception::class)
    override fun configure(http: HttpSecurity) {
        http.authorizeRequests().antMatchers("/**").permitAll()
    }
}

@Profile("!initlocal")
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(securedEnabled = true)
class JwtSecurityConfiguration : WebSecurityConfigurerAdapter() {

    @Value("\${url.unsecure}")
    val URL_UNSECURE: String? = null

    @Value("\${url.user.signup}")
    val URL_SIGNUP: String? = null

    @Resource
    private val userDetailsService: UserDetailsService? = null

    @Bean
    @Throws(NoSuchAlgorithmException::class)
    fun passwordEncoder(): PasswordEncoder? {
        return BCryptPasswordEncoder()
    }

    @Throws(Exception::class)
    override fun configure(authenticationManagerBuilder: AuthenticationManagerBuilder) {
        authenticationManagerBuilder.userDetailsService(userDetailsService)
            .passwordEncoder(passwordEncoder())
    }

    @Throws(Exception::class)
    override fun configure(http: HttpSecurity) {
        http.cors().and()
            .csrf().disable()
            .authorizeRequests()
            .antMatchers("/".plus(URL_UNSECURE).plus("/**")).permitAll()
            .antMatchers(HttpMethod.POST, URL_SIGNUP).permitAll()
            .antMatchers("/**").authenticated()
            .and()
            .addFilter(JwtAuthenticationFilter(authenticationManager()))
            .addFilter(JwtAuthorizationFilter(authenticationManager()))
            .sessionManagement()
            .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
    }

    @Bean
    fun corsConfigurationSource(): CorsConfigurationSource {
        val source = UrlBasedCorsConfigurationSource()
        val config = CorsConfiguration()
        config.applyPermitDefaultValues()
        config.addExposedHeader(HttpHeaders.AUTHORIZATION)
        config.allowedMethods = Arrays.asList("GET", "POST", "PUT", "DELETE")
        source.registerCorsConfiguration("/**", config)
        return source
    }
}