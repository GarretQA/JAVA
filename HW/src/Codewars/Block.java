package Codewars;

public class Block{
    // Good Luck!
    private int[] dims;

    public Block (int[] dims) {
        this.dims = dims;
    }

    public int getWidth () {
        return dims[0];
    }

    public int getHeight() {
        return dims[2];
    }

    public int getLength() {
        return dims[1];
    }

    public int getVolume() {
        return dims[0] * dims[1] * dims[2];
    }

    public int getSurfaceArea() {
        return 2*(dims[0]*dims[1] + dims[0]*dims[2] + dims[1]*dims[2]);
    }
}
