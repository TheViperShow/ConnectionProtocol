package me.thevipershow.connectionprotocol.packets.event.session

import me.thevipershow.connectionprotocol.packets.Session

class ConnectedEvent(val session: Session): SessionEvent {
    override fun call(listener: SessionListener) {
        listener.connected(this)
    }
}