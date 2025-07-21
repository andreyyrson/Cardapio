package Restaurante.cardapio.Entidades;

public record FoodResponseDTO(Long id , String title , String image , Integer price){
    public FoodResponseDTO(Food food){
        this(food.getId() , food.getTitlle(), food.getImage(), food.getPrice());
    }
}
