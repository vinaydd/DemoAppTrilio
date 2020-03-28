package com.example.app.ui.room

import com.twilio.video.RemoteParticipant
import com.twilio.video.Room
import com.example.app.data.api.AuthServiceError


sealed class RoomEvent(val room: Room? = null) {
    object Connecting : RoomEvent()
    class TokenError(val serviceError: AuthServiceError? = null) : RoomEvent()
    class RoomState(room: Room) : RoomEvent(room)
    class ConnectFailure(room: Room) : RoomEvent(room)
    class ParticipantConnected(room: Room, val remoteParticipant: RemoteParticipant) : RoomEvent(room)
    class ParticipantDisconnected(room: Room, val remoteParticipant: RemoteParticipant) : RoomEvent(room)
    class DominantSpeakerChanged(room: Room, val remoteParticipant: RemoteParticipant?) : RoomEvent(room)
}
