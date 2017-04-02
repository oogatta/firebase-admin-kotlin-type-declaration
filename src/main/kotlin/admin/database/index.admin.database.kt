@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:[JsQualifier("database") JsModule("firebase-admin")]
package admin.database

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

external interface Database {
    var app: admin.app.App
    fun goOffline()
    fun goOnline()
    fun ref(path: String? = definedExternally /* null */): admin.database.Reference
    fun refFromURL(url: String): admin.database.Reference
}
external interface DataSnapshot {
    var key: String?
    var ref: admin.database.Reference
    fun child(path: String): admin.database.DataSnapshot
    fun exists(): Boolean
    fun exportVal(): Any
    fun forEach(action: (a: admin.database.DataSnapshot) -> Boolean): Boolean
    fun getPriority(): dynamic /* String | Number | Nothing? */
    fun hasChild(path: String): Boolean
    fun hasChildren(): Boolean
    fun numChildren(): Number
    fun toJSON(): Any
    fun `val`(): Any
}
external interface OnDisconnect {
    fun cancel(onComplete: ((a: Error?) -> Any)? = definedExternally /* null */): Promise<Unit>
    fun remove(onComplete: ((a: Error?) -> Any)? = definedExternally /* null */): Promise<Unit>
    fun set(value: Any, onComplete: ((a: Error?) -> Any)? = definedExternally /* null */): Promise<Unit>
    fun setWithPriority(value: Any, priority: Number, onComplete: ((a: Error?) -> Any)? = definedExternally /* null */): Promise<Unit>
    fun setWithPriority(value: Any, priority: String, onComplete: ((a: Error?) -> Any)? = definedExternally /* null */): Promise<Unit>
    fun setWithPriority(value: Any, priority: Nothing?, onComplete: ((a: Error?) -> Any)? = definedExternally /* null */): Promise<Unit>
    fun update(values: Any, onComplete: ((a: Error?) -> Any)? = definedExternally /* null */): Promise<Unit>
}
external interface Query {
    var ref: admin.database.Reference
    fun endAt(value: Number, key: String? = definedExternally /* null */): admin.database.Query
    fun endAt(value: String, key: String? = definedExternally /* null */): admin.database.Query
    fun endAt(value: Boolean, key: String? = definedExternally /* null */): admin.database.Query
    fun endAt(value: Nothing?, key: String? = definedExternally /* null */): admin.database.Query
    fun equalTo(value: Number, key: String? = definedExternally /* null */): admin.database.Query
    fun equalTo(value: String, key: String? = definedExternally /* null */): admin.database.Query
    fun equalTo(value: Boolean, key: String? = definedExternally /* null */): admin.database.Query
    fun equalTo(value: Nothing?, key: String? = definedExternally /* null */): admin.database.Query
    fun isEqual(other: admin.database.Query?): Boolean
    fun limitToFirst(limit: Number): admin.database.Query
    fun limitToLast(limit: Number): admin.database.Query
    fun off(eventType: String? = definedExternally /* null */, callback: ((a: admin.database.DataSnapshot, b: String? /*= null*/) -> Any)? = definedExternally /* null */, context: Any? = definedExternally /* null */)
    fun on(eventType: String, callback: (a: admin.database.DataSnapshot?, b: String? /*= null*/) -> Any, cancelCallbackOrContext: Any? = definedExternally /* null */, context: Any? = definedExternally /* null */): (a: admin.database.DataSnapshot?, b: String? /*= null*/) -> Any
    fun once(eventType: String, successCallback: ((a: admin.database.DataSnapshot, b: String? /*= null*/) -> Any)? = definedExternally /* null */, failureCallbackOrContext: Any? = definedExternally /* null */, context: Any? = definedExternally /* null */): Promise<Any>
    fun orderByChild(path: String): admin.database.Query
    fun orderByKey(): admin.database.Query
    fun orderByPriority(): admin.database.Query
    fun orderByValue(): admin.database.Query
    fun startAt(value: Number, key: String? = definedExternally /* null */): admin.database.Query
    fun startAt(value: String, key: String? = definedExternally /* null */): admin.database.Query
    fun startAt(value: Boolean, key: String? = definedExternally /* null */): admin.database.Query
    fun startAt(value: Nothing?, key: String? = definedExternally /* null */): admin.database.Query
    fun toJSON(): Any
    override fun toString(): String
}
external interface `T$1` {
    var committed: Boolean
    var snapshot: admin.database.DataSnapshot?
}
external interface Reference : admin.database.Query {
    var key: String?
    var parent: admin.database.Reference?
    var root: admin.database.Reference
    fun child(path: String): admin.database.Reference
    fun onDisconnect(): admin.database.OnDisconnect
    fun push(value: Any? = definedExternally /* null */, onComplete: ((a: Error?) -> Any)? = definedExternally /* null */): admin.database.ThenableReference
    fun remove(onComplete: ((a: Error?) -> Any)? = definedExternally /* null */): Promise<Unit>
    fun set(value: Any, onComplete: ((a: Error?) -> Any)? = definedExternally /* null */): Promise<Unit>
    fun setPriority(priority: String, onComplete: (a: Error?) -> Any): Promise<Unit>
    fun setPriority(priority: Number, onComplete: (a: Error?) -> Any): Promise<Unit>
    fun setPriority(priority: Nothing?, onComplete: (a: Error?) -> Any): Promise<Unit>
    fun setWithPriority(newVal: Any, newPriority: String, onComplete: ((a: Error?) -> Any)? = definedExternally /* null */): Promise<Unit>
    fun setWithPriority(newVal: Any, newPriority: Number, onComplete: ((a: Error?) -> Any)? = definedExternally /* null */): Promise<Unit>
    fun setWithPriority(newVal: Any, newPriority: Nothing?, onComplete: ((a: Error?) -> Any)? = definedExternally /* null */): Promise<Unit>
    fun transaction(transactionUpdate: (a: Any) -> Any, onComplete: ((a: Error?, b: Boolean, c: admin.database.DataSnapshot?) -> Any)? = definedExternally /* null */, applyLocally: Boolean? = definedExternally /* null */): Promise<`T$1`>
    fun update(values: Any, onComplete: ((a: Error?) -> Any)? = definedExternally /* null */): Promise<Unit>
}
external interface ThenableReference : admin.database.Reference, Promise<Any>
external fun enableLogging(logger: Boolean? = definedExternally /* null */, persistent: Boolean? = definedExternally /* null */): Any = definedExternally
external fun enableLogging(logger: (message: String) -> Any? = definedExternally /* null */, persistent: Boolean? = definedExternally /* null */): Any = definedExternally
