package lyl.manci.androidlifecycle.ui

import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import lyl.manci.androidlifecycle.R
import lyl.manci.androidlifecycle.util.logError

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        "before super of oncreate".logError()
        super.onCreate(savedInstanceState)
        "after super of oncreate".logError()
        setContentView(R.layout.activity_main)
        "after setcontentviewin oncreate".logError()
    }


    override fun onStart() {
        super.onStart()
        "after super of onStart".logError()
    }

    override fun onRestart() {
        super.onRestart()
        "after super of onRestart".logError()
    }

    override fun onResume() {
        super.onResume()
        "after super of onResume".logError()
    }

    override fun onPause() {
        super.onPause()
        "after super of onPause".logError()
    }

    override fun onDestroy() {
        super.onDestroy()
        "after super of onStart".logError()
    }

    override fun onStop() {
        super.onStop()
        "after super of onStop".logError()
    }

    override fun onContentChanged() {
        super.onContentChanged()
        "after super of onContentChanged".logError()
    }

    override fun onBackPressed() {
        super.onBackPressed()
        "after super of onBackPressed".logError()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        "before super of onOptionsItemSelected".logError()
        return super.onOptionsItemSelected(item)
    }

    override fun onOptionsMenuClosed(menu: Menu?) {
        super.onOptionsMenuClosed(menu)
        "after super of onOptionsMenuClosed".logError()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        "before super of onCreateOptionsMenu".logError()
        return super.onCreateOptionsMenu(menu)
    }

    override fun onPrepareOptionsMenu(menu: Menu?): Boolean {
        "before super of onPrepareOptionsMenu".logError()
        return super.onPrepareOptionsMenu(menu)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        "after super of onRestoreInstanceState".logError()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        "after super of onSaveInstanceState".logError()
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        "after super of onConfigurationChanged".logError()
    }

    override fun startActivityForResult(intent: Intent?, requestCode: Int) {
        super.startActivityForResult(intent, requestCode)
        "after super of startActivityForResult".logError()
    }

    override fun onUserInteraction() {
        super.onUserInteraction()
        "after super of onUserInteraction".logError()
    }

}