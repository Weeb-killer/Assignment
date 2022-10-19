package abdn.scnu.cs;

import java.util.*;


public class BattleShip extends AbstractBattleShip{
    public BattleShip(String name) {
        this.name=name;
        setShipOrientation();
    }

    public BattleShip() {
    }

    @Override
    public boolean checkAttack(int row, int column) {
        if (this.hits<3){
            for(int i=0;i<3;i++){
                if (row==shipCoordinates[i][0]&&column==shipCoordinates[i][1]){
                    this.hits++;
                }
            }
        }
        if (this.hits==3){
            return false;
        }
        else{
            return true;
        }
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getHits() {
        return hits;
    }

    @Override
    public String getShipOrientation() {
        return shipOrientation;
    }

    @Override
    public void setHits(int numberOfHits) {
        hits=numberOfHits;
    }

    @Override
    public int[][] getShipCoordinates() {
        return shipCoordinates;
    }

    @Override
    public void setShipCoordinates(int[][] coordinates) {
        this.shipCoordinates=coordinates;
    }
}
