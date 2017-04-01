@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsQualifier("admin.messaging")
package admin.messaging

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

external interface `T$2` {
    @nativeGetter
    operator fun get(key: String): String?
    @nativeSetter
    operator fun set(key: String, value: String)
}
external interface `T$3` {
    var tag: String? get() = definedExternally; set(value) = definedExternally
    var body: String? get() = definedExternally; set(value) = definedExternally
    var icon: String? get() = definedExternally; set(value) = definedExternally
    var badge: String? get() = definedExternally; set(value) = definedExternally
    var color: String? get() = definedExternally; set(value) = definedExternally
    var sound: String? get() = definedExternally; set(value) = definedExternally
    var title: String? get() = definedExternally; set(value) = definedExternally
    var bodyLocKey: String? get() = definedExternally; set(value) = definedExternally
    var bodyLocArgs: String? get() = definedExternally; set(value) = definedExternally
    var clickAction: String? get() = definedExternally; set(value) = definedExternally
    var titleLocKey: String? get() = definedExternally; set(value) = definedExternally
    var titleLocArgs: String? get() = definedExternally; set(value) = definedExternally
    @nativeGetter
    operator fun get(key: String): String?
    @nativeSetter
    operator fun set(key: String, value: String?)
}
external interface `T$4` {
    var data: admin.messaging.DataMessagePayload? get() = definedExternally; set(value) = definedExternally
    var notification: admin.messaging.NotificationMessagePayload? get() = definedExternally; set(value) = definedExternally
}
external interface `T$5` {
    var dryRun: Boolean? get() = definedExternally; set(value) = definedExternally
    var priority: String? get() = definedExternally; set(value) = definedExternally
    var timeToLive: Number? get() = definedExternally; set(value) = definedExternally
    var collapseKey: String? get() = definedExternally; set(value) = definedExternally
    var mutableContent: Boolean? get() = definedExternally; set(value) = definedExternally
    var contentAvailable: Boolean? get() = definedExternally; set(value) = definedExternally
    var restrictedPackageName: String? get() = definedExternally; set(value) = definedExternally
    @nativeGetter
    operator fun get(key: String): Any?
    @nativeSetter
    operator fun set(key: String, value: Any?)
}
external interface `T$6` {
    var error: admin.FirebaseError? get() = definedExternally; set(value) = definedExternally
    var messageId: String? get() = definedExternally; set(value) = definedExternally
    var canonicalRegistrationToken: String? get() = definedExternally; set(value) = definedExternally
}
external interface `T$7` {
    var canonicalRegistrationTokenCount: Number
    var failureCount: Number
    var multicastId: Number
    var results: Array<admin.messaging.MessagingDeviceResult>
    var successCount: Number
}
external interface `T$8` {
    var successCount: Number
    var failureCount: Number
    var failedRegistrationTokens: Array<String>
}
external interface `T$9` {
    var messageId: Number
}
external interface `T$10` {
    var messageId: Number
}
external interface Messaging {
    var app: admin.app.App
    fun sendToDevice(registrationToken: String, payload: admin.messaging.MessagingPayload, options: admin.messaging.MessagingOptions? = definedExternally /* null */): Promise<admin.messaging.MessagingDevicesResponse>
    fun sendToDevice(registrationTokens: Array<String>, payload: admin.messaging.MessagingPayload, options: admin.messaging.MessagingOptions? = definedExternally /* null */): Promise<admin.messaging.MessagingDevicesResponse>
    fun sendToDeviceGroup(notificationKey: String, payload: admin.messaging.MessagingPayload, options: admin.messaging.MessagingOptions? = definedExternally /* null */): Promise<admin.messaging.MessagingDeviceGroupResponse>
    fun sendToTopic(topic: String, payload: admin.messaging.MessagingPayload, options: admin.messaging.MessagingOptions? = definedExternally /* null */): Promise<admin.messaging.MessagingTopicResponse>
    fun sendToCondition(condition: String, payload: admin.messaging.MessagingPayload, options: admin.messaging.MessagingOptions? = definedExternally /* null */): Promise<admin.messaging.MessagingConditionResponse>
}
