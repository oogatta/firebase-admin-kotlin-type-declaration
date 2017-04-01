@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsQualifier("admin.auth")
package admin.auth

import kotlin.js.*
import kotlin.js.Json
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.events.*
import org.w3c.dom.parsing.*
import org.w3c.dom.svg.*
import org.w3c.dom.url.*
import org.w3c.fetch.*
import org.w3c.files.*
import org.w3c.notifications.*
import org.w3c.performance.*
import org.w3c.workers.*
import org.w3c.xhr.*

external interface UserMetadata {
    var lastSignedInAt: Date
    var createdAt: Date
    fun toJSON(): Any
}
external interface UserInfo {
    var uid: String
    var displayName: String
    var email: String
    var photoURL: String
    var providerId: String
    fun toJSON(): Any
}
external interface UserRecord {
    var uid: String
    var email: String
    var emailVerified: Boolean
    var displayName: String
    var photoURL: String
    var disabled: Boolean
    var metadata: admin.auth.UserMetadata
    var providerData: Array<admin.auth.UserInfo>
    fun toJSON(): Any
}
external interface `T$0` {
    var identities: Json
    var sign_in_provider: String
    @nativeGetter
    operator fun get(key: String): Any?
    @nativeSetter
    operator fun set(key: String, value: Any)
}
external interface DecodedIdToken {
    var aud: String
    var auth_time: Number
    var exp: Number
    var firebase: `T$0`
    var iat: Number
    var iss: String
    var sub: String
    var uid: String
    @nativeGetter
    operator fun get(key: String): Any?
    @nativeSetter
    operator fun set(key: String, value: Any)
}
external interface Auth {
    var app: admin.app.App
    fun createCustomToken(uid: String, developerClaims: Any? = definedExternally /* null */): Promise<String>
    fun createUser(properties: Any): Promise<admin.auth.UserRecord>
    fun deleteUser(uid: String): Promise<Unit>
    fun getUser(uid: String): Promise<admin.auth.UserRecord>
    fun getUserByEmail(email: String): Promise<admin.auth.UserRecord>
    fun updateUser(uid: String, properties: Any): Promise<admin.auth.UserRecord>
    fun verifyIdToken(idToken: String): Promise<admin.auth.DecodedIdToken>
}
