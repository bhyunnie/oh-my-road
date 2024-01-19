package com.omr.ohmyroad.repository.auth

import org.springframework.security.oauth2.client.web.OAuth2AuthorizedClientRepository
import org.springframework.stereotype.Repository

@Repository
interface CustomAuthorizedClientRepository: OAuth2AuthorizedClientRepository {
}