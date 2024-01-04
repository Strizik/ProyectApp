package com.pepe.elias

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.pepe.elias.firstapp.FirstAppActivity
import com.pepe.elias.imccalculator.ImcCalculatorActivity
import com.pepe.elias.settings.SettingActivity
import com.pepe.elias.superheroapp.SuperHeroListActivity
import com.pepe.elias.todoapp.TodoActiviy

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val btnSaludApp = findViewById<Button>(R.id.btnSaludApp)
        val btnImcApp = findViewById<Button>(R.id.btnIMCApp)
        val btnTODO = findViewById<Button>(R.id.btnTODO)
        val btnSuperhero = findViewById<Button>(R.id.btnSuperhero)
        val btnSettings = findViewById<Button>(R.id.btnSettings)
        btnSaludApp.setOnClickListener { navigateToSaludApp() }
        btnImcApp.setOnClickListener { navigateToImcApp() }
        btnTODO.setOnClickListener { navigateToTodoApp() }
        btnSuperhero.setOnClickListener{ navigateToSuperheroApp() }
        btnSettings.setOnClickListener{ navigateToSettings() }
    }

    private fun navigateToSettings() {
        val intent = Intent(this, SettingActivity::class.java)
        startActivity((intent))
    }


    private fun navigateToImcApp() {
        val intent = Intent(this,ImcCalculatorActivity::class.java )
        startActivity(intent)

    }

    private fun navigateToSaludApp(){

        val intent = Intent (this, FirstAppActivity::class.java )
        startActivity(intent)
        
    }
    private fun navigateToTodoApp() {
        val intent = Intent(this,TodoActiviy::class.java )
        startActivity(intent)

    }
    private fun navigateToSuperheroApp(){
        val intent = Intent (this, SuperHeroListActivity:: class.java)
        startActivity(intent)
    }



}