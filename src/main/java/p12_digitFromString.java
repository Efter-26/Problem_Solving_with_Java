public class p12_digitFromString {
    public static void main(String[] args) {
        String str = "A core i7 laptop price is 85000 tk and a gaming mouse price is 2500 tk. If I buy the laptop and 1 piece mouse, what will be my total cost after giving 15% discount?";
        str = str.replaceAll("[^\\d]", " ");
        str = str.trim();
        str = str.replaceAll(" +", " ");
        System.out.println("Extracted digits from the paragraph: "+ str);
        String[] strArray = str.split(" ");
        double Laptop_price = Double.parseDouble(strArray[1]);
        double mouse_price = Double.parseDouble(strArray[2]);
        double discount_percentage = Double.parseDouble(strArray[4]);
        double total = Laptop_price + mouse_price;
        double apply_discount = (total * discount_percentage)/100;
        double total_cost_after_discount = total - apply_discount;

        long roundedCost = Math.round(total_cost_after_discount);
        System.out.print("Total cost after giving 15% discount: ");
        System.out.print(roundedCost + " tk");

    }
}
