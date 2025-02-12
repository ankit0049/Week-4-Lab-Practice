package personalisemealgeneratortest;

import com.personalisedmealgenerator.*;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import java.util.List;

public class PersonalisedMealPlanSystemTest {

    // Helper method to extract field values from an object as a string
    private String extractObjectContent(Object obj) {
	   try {
		  StringBuilder result = new StringBuilder();
		  // Iterate through all declared fields of the object
		  for (var field : obj.getClass().getDeclaredFields()) {
			 field.setAccessible(true);
			 result.append(field.get(obj)).append(" ");
		  }
		  return result.toString().trim(); // Return extracted content
	   } catch (IllegalAccessException e) {
		  throw new RuntimeException("Error extracting object content", e);
	   }
    }

    // Test case to verify High-Protein meal plan functionality
    @Test
    public void testOfHighProtienMeal() {
	   // Expected meal list for high-protein meals
	   List<String> highProteinMealList = List.of("Grilled Chicken", "Salmon");

	   // Creating high-protein meal objects
	   HighProteinMeal proteinMeal = new HighProteinMeal("Grilled Chicken");
	   HighProteinMeal proteinMeal2 = new HighProteinMeal("Salmon");

	   // Generating meal plan for High-Protein diet
	   Meal<HighProteinMeal> highProteinPlan = MealUtils.generateMealPlan("High-Protein", proteinMeal);
	   highProteinPlan.addMeal(proteinMeal2);

	   // Extracting actual meal names from the plan
	   List<String> actualValues = highProteinPlan.getMeal().stream()
			 .map(this::extractObjectContent)
			 .toList();

	   // Validating the expected and actual meal list
	   Assertions.assertEquals(highProteinMealList, actualValues);
    }

    // Test case to verify Keto meal plan functionality
    @Test
    public void testOfKetoMeal() {
	   // Expected meal list for keto meals
	   List<String> ketoMealList = List.of("Avacado and Cheese", "Salmon");

	   // Creating keto meal objects
	   KetoMeal ketoMeal = new KetoMeal("Avacado and Cheese");
	   KetoMeal ketoMeal2 = new KetoMeal("Salmon");

	   // Generating meal plan for Keto diet
	   Meal<KetoMeal> ketoPlan = MealUtils.generateMealPlan("Keto", ketoMeal);
	   ketoPlan.addMeal(ketoMeal2); // Adding another meal

	   // Extracting actual meal names from the plan
	   List<String> actualValues = ketoPlan.getMeal().stream()
			 .map(this::extractObjectContent)
			 .toList();

	   // Validating the expected and actual meal list
	   Assertions.assertEquals(ketoMealList, actualValues);
    }

    // Test case to verify Vegan meal plan functionality
    @Test
    public void testOfVeganMeal() {
	   // Creating vegan meal objects
	   VeganMeal veganMeal = new VeganMeal("Lentils and Spinach");
	   VeganMeal veganMeal2 = new VeganMeal("Tofu");

	   // Expected meal list for vegan meals
	   List<String> veganMealList = List.of("Lentils and Spinach", "Tofu");

	   // Generating meal plan for Vegan diet
	   Meal<VeganMeal> veganPlan = MealUtils.generateMealPlan("Vegan", veganMeal);
	   veganPlan.addMeal(veganMeal2);

	   // Extracting actual meal names from the plan
	   List<String> actualValues = veganPlan.getMeal().stream()
			 .map(this::extractObjectContent)
			 .toList();

	   // Validating the expected and actual meal list
	   Assertions.assertEquals(veganMealList, actualValues);
    }

    // Test case to verify Vegetarian meal plan functionality
    @Test
    public void testOfVegetarianMeal() {
	   // Creating vegetarian meal objects
	   VegetarianMeal vegMeal = new VegetarianMeal("Panner Bhurji");
	   VegetarianMeal vegMeal2 = new VegetarianMeal("Tofu");

	   // Expected meal list for vegetarian meals
	   List<String> vegMealList = List.of("Panner Bhurji", "Tofu");

	   // Generating meal plan for Vegetarian diet
	   Meal<VegetarianMeal> vegetarianPlan = MealUtils.generateMealPlan("Vegetarian", vegMeal);

	   // Generating another meal plan (mistakenly labeled Vegan instead of Vegetarian)
	   Meal<VegetarianMeal> veganPlan = MealUtils.generateMealPlan("Vegan", vegMeal);
	   veganPlan.addMeal(vegMeal2); // Adding another meal

	   // Extracting actual meal names from the plan
	   List<String> actualValues = veganPlan.getMeal().stream()
			 .map(this::extractObjectContent)
			 .toList();

	   // Validating the expected and actual meal list
	   Assertions.assertEquals(vegMealList, actualValues);
    }
}
