package com.jwo.quickdefaultstile

import android.content.Intent
import android.provider.Settings
import android.service.quicksettings.TileService
import android.widget.Toast

class QuickDefaultsService : TileService() {

    override fun onClick() {
        super.onClick()
        val intent = Intent(Settings.ACTION_MANAGE_DEFAULT_APPS_SETTINGS)
        if (intent.resolveActivity(packageManager) != null) {
            startActivityAndCollapse(intent)
        } else {
            Toast.makeText(this, "Unable to open defaults settings", Toast.LENGTH_SHORT).show()
        }
    }
}
