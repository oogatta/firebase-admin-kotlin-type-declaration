@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:[JsQualifier("admin"), JsModule("firebase-admin")]
package admin

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

external interface FirebaseError {
    var code: String
    var message: String
    var stack: String
    fun toJSON(): Any
}
external interface ServiceAccount {
    var projectId: String? get() = definedExternally; set(value) = definedExternally
    var clientEmail: String? get() = definedExternally; set(value) = definedExternally
    var privateKey: String? get() = definedExternally; set(value) = definedExternally
}
external interface GoogleOAuthAccessToken {
    var access_token: String
    var expires_in: Number
}
external interface AppOptions {
    var credential: admin.credential.Credential? get() = definedExternally; set(value) = definedExternally
    var databaseAuthVariableOverride: Any? get() = definedExternally; set(value) = definedExternally
    var databaseURL: String? get() = definedExternally; set(value) = definedExternally
    var serviceAccount: dynamic /* String | admin.ServiceAccount */ get() = definedExternally; set(value) = definedExternally
    var storageBucket: String? get() = definedExternally; set(value) = definedExternally
}
external var SDK_VERSION: String = definedExternally
external var apps: Array<admin.app.App?> = definedExternally
external fun app(name: String? = definedExternally /* null */): admin.app.App = definedExternally
external fun auth(app: admin.app.App? = definedExternally /* null */): admin.auth.Auth = definedExternally
external fun database(app: admin.app.App? = definedExternally /* null */): admin.database.Database = definedExternally
external fun messaging(app: admin.app.App? = definedExternally /* null */): admin.messaging.Messaging = definedExternally
external fun initializeApp(options: admin.AppOptions, name: String? = definedExternally /* null */): admin.app.App = definedExternally
