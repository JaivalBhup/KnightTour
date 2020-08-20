package a;

public class knight {
    private int x;
    private int y;
    public knight() {
    	this.x=0;
    	this.y=0;
    }
    public knight(int x,int y){
        this.x=x;
        this.y=y;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }
    public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}


	public int getAccesibleNumber(int x,int y){
        int accesibleNum = 0;
        if (x + 2 <= 7 && y + 1 <= 7) {
          accesibleNum++;
        }
        if (x + 2 <= 7 && y - 1 >= 0) {
            accesibleNum++;
        }
        if (x + 1 <= 7 && y - 2 >= 0) {
            accesibleNum++;
        }
        if (x - 1 >= 0 && y - 2 >= 0) {
            accesibleNum++;
        }
        if (x - 2 >= 0 && y + 1 <= 7) {
            accesibleNum++;
        }
        if (x - 2 >= 0 && y - 1 >= 0) {
            accesibleNum++;
        }
        if (x - 1 >= 0 && y + 2 <= 7) {
            accesibleNum++;
        }
        if (x +1 <= 7 && y + 2 <= 7) {
            accesibleNum++;
        }
        return accesibleNum;
    }
}
