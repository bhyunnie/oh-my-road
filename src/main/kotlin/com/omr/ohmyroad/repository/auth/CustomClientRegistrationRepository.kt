package com.omr.ohmyroad.repository.auth

import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository
import org.springframework.stereotype.Repository

@Repository
interface CustomClientRegistrationRepository: ClientRegistrationRepository {

}
