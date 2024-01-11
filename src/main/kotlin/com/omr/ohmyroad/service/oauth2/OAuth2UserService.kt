package com.omr.ohmyroad.service.oauth2

import org.springframework.security.core.authority.AuthorityUtils
import org.springframework.security.oauth2.client.userinfo.DefaultOAuth2UserService
import org.springframework.security.oauth2.client.userinfo.OAuth2UserRequest
import org.springframework.security.oauth2.core.user.DefaultOAuth2User
import org.springframework.security.oauth2.core.user.OAuth2User
import org.springframework.stereotype.Service

@Service
class OAuth2UserService: DefaultOAuth2UserService() {
    @Override
    override fun loadUser(userRequest: OAuth2UserRequest):OAuth2User {
        val oAuth2User:OAuth2User = super.loadUser(userRequest)
        val authorities = AuthorityUtils.createAuthorityList("ROLE_ADMIN")

        val userNameAttribute = userRequest.clientRegistration.providerDetails.userInfoEndpoint.userNameAttributeName

        // TODO DB 저장 로직
        println("bhlog => $userNameAttribute")

        return DefaultOAuth2User(authorities, oAuth2User.attributes, userNameAttribute)
    }

    fun authorizationRequestResolver() {

    }
}