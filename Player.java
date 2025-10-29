import java.util.*;

public class Player {
    private int playerID;
    private String playerName;
    private boolean micStatus;
    private boolean speakerStatus;

    // Constructor
    public Player(int playerID, String playerName) {
        this.playerID = playerID;
        this.playerName = playerName;
        this.micStatus = false;
        this.speakerStatus = true;
    }

    // Getters
    public int getPlayerID() { return playerID; }
    public String getPlayerName() { return playerName; }
    public boolean isMicOn() { return micStatus; }
    public boolean isSpeakerOn() { return speakerStatus; }

    // Setters
    public void setMicStatus(boolean status) { this.micStatus = status; }
    public void setSpeakerStatus(boolean status) { this.speakerStatus = status; }

    // Methods
    public void toggleMic() {}
    public void toggleSpeaker() {}
    public void sendVoiceData() {}
    public void receiveVoiceData() {}
}

class VoiceChannel {
    private int channelID;
    private String channelType; // team/global
    private boolean isMuted;
    private List<Player> connectedPlayers;

    // Constructor
    public VoiceChannel(int channelID, String channelType) {
        this.channelID = channelID;
        this.channelType = channelType;
        this.isMuted = false;
        this.connectedPlayers = new ArrayList<>();
    }

    // Methods
    public void joinChannel(Player player) {}
    public void leaveChannel(Player player) {}
    public void transmitVoice(Player sender) {}
    public void receiveVoice(Player receiver) {}
    public void muteChannel() {}
    public void unmuteChannel() {}
}

class VoiceChatSystem {
    private int chatID;
    private List<Player> playerList;
    private List<VoiceChannel> voiceChannels;

    // Constructor
    public VoiceChatSystem(int chatID) {
        this.chatID = chatID;
        this.playerList = new ArrayList<>();
        this.voiceChannels = new ArrayList<>();
    }

    // Methods
    public void createChannel(String type) {}
    public void addPlayer(Player player) {}
    public void removePlayer(Player player) {}
    public void sendVoice(Player sender) {}
    public void mutePlayer(Player player) {}
    public void unmutePlayer(Player player) {}
}

class MatchServer {
    private int serverID;
    private List<Player> connectedPlayers;

    // Constructor
    public MatchServer(int serverID) {
        this.serverID = serverID;
        this.connectedPlayers = new ArrayList<>();
    }

    // Methods
    public void connectPlayer(Player player) {}
    public void disconnectPlayer(Player player) {}
    public void broadcastData() {}
    public void manageVoicePackets() {}
}
