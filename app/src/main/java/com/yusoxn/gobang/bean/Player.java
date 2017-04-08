package com.yusoxn.gobang.bean;

/**
 * 通用玩家
 * <p>
 * Created by Yusxon on 17/4/8.
 */

public class Player implements IPlayer {

    protected String playerName;
    protected int color;
    protected ChessPoint tempChessPoint;

    public Player(String playerName, int color) {
        this.playerName = playerName;
        this.color = color;
    }

    @Override
    public String getPlayerName() {
        return playerName;
    }

    @Override
    public ChessPoint getChessPosition() {
        return null;
    }

    @Override
    public boolean isAI() {
        return false;
    }

    @Override
    public int getChessColor() {
        return color;
    }

    @Override
    public void setChessPosition(ChessPoint chessPosition) {
        tempChessPoint = new ChessPoint(chessPosition.x, chessPosition.y, chessPosition.color);
    }
}