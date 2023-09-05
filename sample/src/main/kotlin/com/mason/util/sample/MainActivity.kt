package com.mason.util.sample

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.mason.util.context.startActivity
import com.mason.util.sample.compress.CompressTestActivity
import pub.devrel.easypermissions.EasyPermissions


class MainActivity : AppCompatActivity(), EasyPermissions.PermissionCallbacks {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.btn_compress).setOnClickListener {
            doEvent()
        }
    }

    companion object {
        const val a = 1
    }

    private fun doEvent() {
        if (PermissionHelper.checkStoragePermission(this)) {
            startActivity<CompressTestActivity>()
        } else {
            PermissionHelper.requestStoragePermission(this)
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        @Suppress("DEPRECATION")
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        EasyPermissions.onRequestPermissionsResult(requestCode, permissions, grantResults, this)
    }

    override fun onPermissionsGranted(requestCode: Int, perms: MutableList<String>) {
        println("onPermissionsGranted $perms")
    }

    override fun onPermissionsDenied(requestCode: Int, perms: MutableList<String>) {
        println("onPermissionsGranted ${perms.size}")
        Toast.makeText(this, "该功能需要开启权限", Toast.LENGTH_SHORT).show()
//        finish()
    }
}

