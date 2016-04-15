package com.teamtreehouse.giflib.data;

import com.teamtreehouse.giflib.model.Category;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * Created by davidsudia on 4/15/16.
 */
@Component
public class CategoryRepository {
    private static final List<Category> ALL_CATEGORIES = Arrays.asList(
            new Category(1, "Robots"),
            new Category(2, "People"),
            new Category(3, "Things")
    );

    public Category findById(int id) {
        for(Category category : ALL_CATEGORIES) {
            if(category.getId() == id ) {
                return category;
            }
        }
        return null;
    }

    public List<Category> getAllCategories() { return ALL_CATEGORIES; }
}
