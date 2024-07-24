package com.example.player;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.*;
import com.example.player.PlayerService;
import com.example.player.Player;

@RestController
public class PlayerController {
    PlayerService apiservice = new PlayerService();

    @GetMapping("/players")
    public ArrayList<Player> getPlayer() {
        return apiservice.getPlayers();
    }

    @PostMapping("/players")
    public Player addPlayer(@RequestBody Player player) {
        return apiservice.addPlayer(player);
    }

    @GetMapping("/player/{playerId}")

    public Player getPlayerById(@PathVariable("playerId") int playerId) {
        return apiservice.getPlayerById(playerId);

    }

    @PutMapping("players/{playerId}")

    public Player updatPlayer(@PathVariable("playerId") int playerId, @RequestBody Player player) {
        return apiservice.updatePlayer(playerId, player);
    }

    @DeleteMapping("players/{playerId}")

    public void deletePlayer(@PathVariable("playerId") int playerId) {
        apiservice.deletePlayer(playerId);
    }

}
