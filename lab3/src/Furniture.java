public abstract class Furniture {
    private int legCount, price;
    private double height, width, depth;
    private boolean maySeat;
    private String modelName;

    public Furniture(int legCount, double height, double width, double depth, boolean maySeat, int price, String modelName) {
        this.legCount = legCount;
        if(height <= 0)
            throw new IllegalArgumentException("Недопустимая высота");
        this.height = height;
        if(width <= 0)
            throw new IllegalArgumentException("Недопустимая ширина");
        this.width = width;
        if(depth <= 0)
            throw new IllegalArgumentException("Недопустимая глубина");
        this.depth = depth;
        this.maySeat = maySeat;
        this.price = price;
        this.modelName = modelName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setHeight(int height) {
        if(height <= 0)
            throw new IllegalArgumentException("Недопустимая высота");
        this.height = height;
    }

    public void setWidth(int width) {
        if(width <= 0)
            throw new IllegalArgumentException("Недопустимая ширина");
        this.width = width;
    }

    public void setDepth(int depth) {
        if(depth <= 0)
            throw new IllegalArgumentException("Недопустимая глубина");
        this.depth = depth;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getDepth() {
        return depth;
    }

    public int getLegCount() {
        return legCount;
    }

    public boolean isMaySeat() {
        return maySeat;
    }

    @Override
    public String toString() {
        return "Название модели: " + modelName + ", Число ножек: " + legCount + ", Высота: " + height + ", Длинна: " + width + ", Глубина: " + depth + ", Можно сидеть: " + maySeat + ", Цена: " + price;
    }
}
