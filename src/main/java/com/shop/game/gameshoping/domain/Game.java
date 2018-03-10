package com.shop.game.gameshoping.domain;

import javax.persistence.*;

public class Game extends BaseEntity {
    /**
     * 主键
     */
    @Id
    @Column(name = "game_id")
    private Integer gameId;

    @Column(name = "game_name")
    private String gameName;

    private String alphabet;

    @Column(name = "game_icon")
    private String gameIcon;

    @Column(name = "game_type")
    private Integer gameType;

    /**
     * 获取主键
     *
     * @return game_id - 主键
     */
    public Integer getGameId() {
        return gameId;
    }

    /**
     * 设置主键
     *
     * @param gameId 主键
     */
    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    /**
     * @return game_name
     */
    public String getGameName() {
        return gameName;
    }

    /**
     * @param gameName
     */
    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    /**
     * @return alphabet
     */
    public String getAlphabet() {
        return alphabet;
    }

    /**
     * @param alphabet
     */
    public void setAlphabet(String alphabet) {
        this.alphabet = alphabet;
    }

    /**
     * @return game_icon
     */
    public String getGameIcon() {
        return gameIcon;
    }

    /**
     * @param gameIcon
     */
    public void setGameIcon(String gameIcon) {
        this.gameIcon = gameIcon;
    }

    /**
     * @return game_type
     */
    public Integer getGameType() {
        return gameType;
    }

    /**
     * @param gameType
     */
    public void setGameType(Integer gameType) {
        this.gameType = gameType;
    }
}