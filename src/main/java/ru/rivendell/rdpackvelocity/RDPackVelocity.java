package ru.rivendell.rdpackvelocity;

import com.google.inject.Inject;
import com.velocitypowered.api.event.player.ServerPreConnectEvent;
import com.velocitypowered.api.event.proxy.ProxyInitializeEvent;
import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.plugin.Plugin;
import com.velocitypowered.api.proxy.Player;
import org.slf4j.Logger;

@Plugin(
        id = "rdpackvelocity",
        name = "RDPackVelocity",
        version = "1.0-SNAPSHOT"
)
public class RDPackVelocity {

    @Inject
    private Logger logger;

    @Subscribe
    public void onProxyInitialization(ProxyInitializeEvent event) {
    }

    @Subscribe
    public void onPlayerJoin(ServerPreConnectEvent event) {
        Player player = event.getPlayer();
    }
}
