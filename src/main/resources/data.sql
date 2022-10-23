INSERT INTO recipe_rest_assignment.ingredient (ingredient_id, ingredient_name)VALUES (501, 'Egg');
INSERT INTO recipe_rest_assignment.ingredient (ingredient_id, ingredient_name)VALUES (502, 'Milk');
INSERT INTO recipe_rest_assignment.ingredient (ingredient_id, ingredient_name)VALUES (503, 'Cheese');
INSERT INTO recipe_rest_assignment.ingredient (ingredient_id, ingredient_name)VALUES (504, 'Chicken');
INSERT INTO recipe_rest_assignment.ingredient (ingredient_id, ingredient_name)VALUES (505, 'Flour');
INSERT INTO recipe_rest_assignment.ingredient (ingredient_id, ingredient_name)VALUES (506, 'Cheddar cheese');
INSERT INTO recipe_rest_assignment.ingredient (ingredient_id, ingredient_name)VALUES (507, 'Pasta');
INSERT INTO recipe_rest_assignment.ingredient (ingredient_id, ingredient_name)VALUES (508, 'Onion');
INSERT INTO recipe_rest_assignment.ingredient (ingredient_id, ingredient_name)VALUES (509, 'Butter');
INSERT INTO recipe_rest_assignment.ingredient (ingredient_id, ingredient_name)VALUES (510, 'Potato');
INSERT INTO recipe_rest_assignment.ingredient (ingredient_id, ingredient_name)VALUES (511, 'Mustard');
INSERT INTO recipe_rest_assignment.ingredient (ingredient_id, ingredient_name)VALUES (512, 'Mushroom');
INSERT INTO recipe_rest_assignment.ingredient (ingredient_id, ingredient_name)VALUES (513, 'Sugar');
INSERT INTO recipe_rest_assignment.ingredient (ingredient_id, ingredient_name)VALUES (514, 'Fish');
INSERT INTO recipe_rest_assignment.ingredient (ingredient_id, ingredient_name)VALUES (515, 'Tomato');

INSERT INTO recipe_rest_assignment.recipe_instruction (recipe_instruction_id, instructions)VALUES (101,'instruction for pasta');
INSERT INTO recipe_rest_assignment.recipe_instruction (recipe_instruction_id, instructions)VALUES (102,'instruction for cake');
INSERT INTO recipe_rest_assignment.recipe_instruction (recipe_instruction_id, instructions)VALUES (103,'instruction for baking chicken');
INSERT INTO recipe_rest_assignment.recipe_instruction (recipe_instruction_id, instructions)VALUES (104,'instruction for waffle');
INSERT INTO recipe_rest_assignment.recipe_instruction (recipe_instruction_id, instructions)VALUES (105,'instruction for Pancake');
INSERT INTO recipe_rest_assignment.recipe_instruction (recipe_instruction_id, instructions)VALUES (106,'instruction for Salad');

INSERT INTO recipe_rest_assignment.recipe (recipe_id, recipe_name, instruction_id)VALUES (201, 'Vanilla cake', 102);
INSERT INTO recipe_rest_assignment.recipe (recipe_id, recipe_name, instruction_id)VALUES (202, 'Grill chicken', 103);
INSERT INTO recipe_rest_assignment.recipe (recipe_id, recipe_name, instruction_id)VALUES (203, 'Alfredo pasta', 101);
INSERT INTO recipe_rest_assignment.recipe (recipe_id, recipe_name, instruction_id)VALUES (204, 'Waffle', 104);
INSERT INTO recipe_rest_assignment.recipe (recipe_id, recipe_name, instruction_id)VALUES (205, 'Mini Pancake', 105);
INSERT INTO recipe_rest_assignment.recipe (recipe_id, recipe_name, instruction_id)VALUES (206, 'Mushroom salad', 106);

INSERT INTO recipe_rest_assignment.recipe_category (recipe_category_id, category)VALUES (301, 'Soup');
INSERT INTO recipe_rest_assignment.recipe_category (recipe_category_id, category)VALUES (302, 'Breakfast');
INSERT INTO recipe_rest_assignment.recipe_category (recipe_category_id, category)VALUES (303, 'Vegetarian');
INSERT INTO recipe_rest_assignment.recipe_category (recipe_category_id, category)VALUES (304, 'Appetisers');
INSERT INTO recipe_rest_assignment.recipe_category (recipe_category_id, category)VALUES (305, 'Desserts');
INSERT INTO recipe_rest_assignment.recipe_category (recipe_category_id, category)VALUES (306, 'Lunch');
INSERT INTO recipe_rest_assignment.recipe_category (recipe_category_id, category)VALUES (307, 'Holiday');
INSERT INTO recipe_rest_assignment.recipe_category (recipe_category_id, category)VALUES (308, 'Grill food');

INSERT INTO recipe_rest_assignment.recipe_ingredient (recipe_ingredient_id, amount, measurement, ingredient_ingredient_id, recipe_id)VALUES (401, 70, 2, 501, 201);
INSERT INTO recipe_rest_assignment.recipe_ingredient (recipe_ingredient_id, amount, measurement, ingredient_ingredient_id, recipe_id)VALUES (402, 400, 2, 505, 201);
INSERT INTO recipe_rest_assignment.recipe_ingredient (recipe_ingredient_id, amount, measurement, ingredient_ingredient_id, recipe_id)VALUES (403, 200, 2, 513, 201);
INSERT INTO recipe_rest_assignment.recipe_ingredient (recipe_ingredient_id, amount, measurement, ingredient_ingredient_id, recipe_id)VALUES (404, 2, 0, 509, 201);
INSERT INTO recipe_rest_assignment.recipe_ingredient (recipe_ingredient_id, amount, measurement, ingredient_ingredient_id, recipe_id)VALUES (405, 100, 5, 502, 201);
INSERT INTO recipe_rest_assignment.recipe_ingredient (recipe_ingredient_id, amount, measurement, ingredient_ingredient_id, recipe_id)VALUES (406, 50, 2, 509, 202);
INSERT INTO recipe_rest_assignment.recipe_ingredient (recipe_ingredient_id, amount, measurement, ingredient_ingredient_id, recipe_id)VALUES (407, 1, 4, 504, 202);
INSERT INTO recipe_rest_assignment.recipe_ingredient (recipe_ingredient_id, amount, measurement, ingredient_ingredient_id, recipe_id)VALUES (408, 100, 2, 508, 202);
INSERT INTO recipe_rest_assignment.recipe_ingredient (recipe_ingredient_id, amount, measurement, ingredient_ingredient_id, recipe_id)VALUES (409, 500, 2, 507, 203);
INSERT INTO recipe_rest_assignment.recipe_ingredient (recipe_ingredient_id, amount, measurement, ingredient_ingredient_id, recipe_id)VALUES (410, 2, 0, 509, 203);
INSERT INTO recipe_rest_assignment.recipe_ingredient (recipe_ingredient_id, amount, measurement, ingredient_ingredient_id, recipe_id)VALUES (411, 5, 0, 506, 203);
INSERT INTO recipe_rest_assignment.recipe_ingredient (recipe_ingredient_id, amount, measurement, ingredient_ingredient_id, recipe_id)VALUES (412, 100, 5, 502, 203);
INSERT INTO recipe_rest_assignment.recipe_ingredient (recipe_ingredient_id, amount, measurement, ingredient_ingredient_id, recipe_id)VALUES (413, 150, 2, 501, 204);
INSERT INTO recipe_rest_assignment.recipe_ingredient (recipe_ingredient_id, amount, measurement, ingredient_ingredient_id, recipe_id)VALUES (414, 150, 5, 502, 204);
INSERT INTO recipe_rest_assignment.recipe_ingredient (recipe_ingredient_id, amount, measurement, ingredient_ingredient_id, recipe_id)VALUES (415, 100, 2, 513, 204);
INSERT INTO recipe_rest_assignment.recipe_ingredient (recipe_ingredient_id, amount, measurement, ingredient_ingredient_id, recipe_id)VALUES (416, 200, 2, 505, 204);
INSERT INTO recipe_rest_assignment.recipe_ingredient (recipe_ingredient_id, amount, measurement, ingredient_ingredient_id, recipe_id)VALUES (417, 300, 2, 505, 205);
INSERT INTO recipe_rest_assignment.recipe_ingredient (recipe_ingredient_id, amount, measurement, ingredient_ingredient_id, recipe_id)VALUES (418, 250, 5, 502, 205);
INSERT INTO recipe_rest_assignment.recipe_ingredient (recipe_ingredient_id, amount, measurement, ingredient_ingredient_id, recipe_id)VALUES (419, 150, 2, 513, 205);
INSERT INTO recipe_rest_assignment.recipe_ingredient (recipe_ingredient_id, amount, measurement, ingredient_ingredient_id, recipe_id)VALUES (420, 70, 2, 501, 205);
INSERT INTO recipe_rest_assignment.recipe_ingredient (recipe_ingredient_id, amount, measurement, ingredient_ingredient_id, recipe_id)VALUES (421, 3, 0, 509, 205);
INSERT INTO recipe_rest_assignment.recipe_ingredient (recipe_ingredient_id, amount, measurement, ingredient_ingredient_id, recipe_id)VALUES (422, 100, 2, 503, 206);
INSERT INTO recipe_rest_assignment.recipe_ingredient (recipe_ingredient_id, amount, measurement, ingredient_ingredient_id, recipe_id)VALUES (423, 1, 4, 510, 206);
INSERT INTO recipe_rest_assignment.recipe_ingredient (recipe_ingredient_id, amount, measurement, ingredient_ingredient_id, recipe_id)VALUES (424, 500, 2, 512, 206);
INSERT INTO recipe_rest_assignment.recipe_ingredient (recipe_ingredient_id, amount, measurement, ingredient_ingredient_id, recipe_id)VALUES (425, 300, 2, 515, 206);
INSERT INTO recipe_rest_assignment.recipe_ingredient (recipe_ingredient_id, amount, measurement, ingredient_ingredient_id, recipe_id)VALUES (426, 2, 1, 511, 206);

INSERT INTO recipe_rest_assignment.recipe_category_recipes (categories_recipe_category_id, recipes_recipe_id)VALUES (305, 201);
INSERT INTO recipe_rest_assignment.recipe_category_recipes (categories_recipe_category_id, recipes_recipe_id)VALUES (307, 201);
INSERT INTO recipe_rest_assignment.recipe_category_recipes (categories_recipe_category_id, recipes_recipe_id)VALUES (306, 202);
INSERT INTO recipe_rest_assignment.recipe_category_recipes (categories_recipe_category_id, recipes_recipe_id)VALUES (307, 202);
INSERT INTO recipe_rest_assignment.recipe_category_recipes (categories_recipe_category_id, recipes_recipe_id)VALUES (308, 202);
INSERT INTO recipe_rest_assignment.recipe_category_recipes (categories_recipe_category_id, recipes_recipe_id)VALUES (306, 203);
INSERT INTO recipe_rest_assignment.recipe_category_recipes (categories_recipe_category_id, recipes_recipe_id)VALUES (302, 204);
INSERT INTO recipe_rest_assignment.recipe_category_recipes (categories_recipe_category_id, recipes_recipe_id)VALUES (304, 204);
INSERT INTO recipe_rest_assignment.recipe_category_recipes (categories_recipe_category_id, recipes_recipe_id)VALUES (302, 205);
INSERT INTO recipe_rest_assignment.recipe_category_recipes (categories_recipe_category_id, recipes_recipe_id)VALUES (305, 205);
INSERT INTO recipe_rest_assignment.recipe_category_recipes (categories_recipe_category_id, recipes_recipe_id)VALUES (303, 206);
INSERT INTO recipe_rest_assignment.recipe_category_recipes (categories_recipe_category_id, recipes_recipe_id)VALUES (306, 206);
