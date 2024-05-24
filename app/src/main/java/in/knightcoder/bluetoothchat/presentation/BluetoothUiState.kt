package `in`.knightcoder.bluetoothchat.presentation

import `in`.knightcoder.bluetoothchat.domain.BluetoothDevice
import `in`.knightcoder.bluetoothchat.domain.BluetoothMessage

data class BluetoothUiState(
    val scannedDevices: List<BluetoothDevice> = emptyList(),
    val pairedDevices: List<BluetoothDevice> = emptyList(),
    val isConnected: Boolean = false,
    val isConnecting: Boolean = false,
    val errorMessage: String? = null,
    val messages: List<BluetoothMessage> = emptyList()
)
