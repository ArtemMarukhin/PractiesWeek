package oopweek;

public class Print {
    private String processor, graphicCard, motherBoardModel;
    private int price;

    public Print(String processor, String graphicCard, String motherBoardModel, int price) {
        this.processor = processor;
        this.graphicCard = graphicCard;
        this.motherBoardModel = motherBoardModel;
        this.price = price;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getGraphicCard() {
        return graphicCard;
    }

    public void setGraphicCard(String graphicCard) {
        this.graphicCard = graphicCard;
    }

    public String getMotherBoardModel() {
        return motherBoardModel;
    }

    public void setMotherBoardModel(String motherBoardModel) {
        this.motherBoardModel = motherBoardModel;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
