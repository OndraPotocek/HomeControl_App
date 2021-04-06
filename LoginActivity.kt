package com.example.homecontrol

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import io.realm.Realm
import org.eclipse.paho.android.service.MqttAndroidClient
import org.eclipse.paho.client.mqttv3.*
import org.w3c.dom.Text
import java.lang.Exception
import java.lang.IllegalArgumentException
import java.util.*

const val MIME_TEXT_PLAIN = "text/plain"
class LoginActivity : AppCompatActivity() {

    private lateinit var mqttClient: MqttAndroidClient
    // TAG
    companion object {
        const val TAG = "AndroidMqttClient"
    }

    private var controller: Boolean = false

    private var etUsername: EditText? = null
    private var etPassword: EditText? = null
    private var btnLogin: Button? = null
    private var tvWrongUsernameOrPasswordMessage: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        initViews()
        this.btnLogin?.setOnClickListener {

            /*try {
                realm.beginTransaction()
                val user: LoggedUser
                user = realm.createObject(LoggedUser::class.java)
                user.username = etUsername?.text.toString()
                user.password = etPassword?.text.toString()
                realm.commitTransaction()

            }
            catch (e: Exception) {Toast.makeText(this, "Chyba při zadávání uživatelského jména", Toast.LENGTH_SHORT).show()}*/
            //connect(this)
            //if (controller) {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            //}

        }

    }

    /*fun connect(context: Context) {
        val serverURI = "mqtt://webelias.site:8883"
        mqttClient = MqttAndroidClient(context, serverURI, "kotlin_client")
        mqttClient.setCallback(object : MqttCallback {
            override fun messageArrived(topic: String?, message: MqttMessage?) {
                Log.d(TAG, "Receive message: ${message.toString()} from topic: $topic")
            }

            override fun connectionLost(cause: Throwable?) {
                Log.d(TAG, "Connection lost ${cause.toString()}")
            }

            override fun deliveryComplete(token: IMqttDeliveryToken?) {

            }
        })
        val options = MqttConnectOptions()
        options.userName = this.etUsername?.text.toString()
        options.password = this.etPassword?.text.toString().toCharArray()

        try {
            mqttClient.connect(options, null, object : IMqttActionListener {
                override fun onSuccess(asyncActionToken: IMqttToken?) {
                    Log.d(TAG, "Connection success")
                    controller = true
                }

                override fun onFailure(asyncActionToken: IMqttToken?, exception: Throwable?) {
                    Log.d(TAG, "Connection failure")
                    displayWrongUsernameOrPasswordMessage()
                }
            })
        } catch (e: MqttException) {
            e.printStackTrace()

        }

    }

    private fun displayWrongUsernameOrPasswordMessage(){
        this.tvWrongUsernameOrPasswordMessage?.setTransitionVisibility(View.VISIBLE)
    }*/

    private fun initViews(){
        this.etUsername = findViewById(R.id.et_username)
        this.etPassword = findViewById(R.id.et_password)
        this.btnLogin = findViewById(R.id.btn_login)
        this.tvWrongUsernameOrPasswordMessage = findViewById(R.id.tv_wrong_username_or_password_messge)
    }

}