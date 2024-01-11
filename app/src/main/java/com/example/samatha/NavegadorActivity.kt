package com.example.samatha

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationMenuView
import com.google.android.material.bottomnavigation.BottomNavigationView

class NavegadorActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navegador)

        val bottomNavigationView : BottomNavigationView = findViewById(R.id.barraNavegacion)

        val inicioFragment = InicioFragment()
        val meditacionFragment = MeditacionFragment()
        val musicaFragment = MusicaFragment()
        val chatFragment = ChatFragment()
        val contactoFragment = ContactoFragment()


        bottomNavigationView.setOnItemSelectedListener {
            when(it.itemId) {
                R.id.nav_home -> {
                    setCurrentFragment(inicioFragment)
                    true
                }

                R.id.nav_meditate -> {
                    setCurrentFragment(meditacionFragment)
                    true
                }

                R.id.nav_music -> {
                    setCurrentFragment(musicaFragment)
                    true
                }

                R.id.nav_chat -> {
                    setCurrentFragment(chatFragment)
                    true
                }

                R.id.nav_contacto -> {
                    setCurrentFragment(contactoFragment)
                    true
                }

                else -> false
            }
        }
    }

    private fun setCurrentFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.containerView, fragment)
                .commit()
        }
    }
}