package hu.flowacademy.kingmakerbackend.model.building;

public enum BuildingType {
    BANK("Bank", 65, 13),
    GOLDMINE("Goldmine", 80, 15),
    MARKETPLACE("Marketplace", 50, 10),
    VINEYARD("Vineyard", 30, 6);

    public final String buildingName;
    public final int buildingPrice;
    public final int buildingInterest;

    BuildingType(String buildingName, int buildingPrice, int buildingInterest) {
        this.buildingName = buildingName;
        this.buildingPrice = buildingPrice;
        this.buildingInterest = buildingInterest;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public int getBuildingPrice() {
        return buildingPrice;
    }

    public int getBuildingInterest() {
        return buildingInterest;
    }
}
