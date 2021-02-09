.Interface;

import tensorflow.search.search.Model.Product;
import tensorflow.search.search.Model.Products;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * 
 */


public interface RetrofitInterface {
    @GET("raw/c2854a0b65ddf79194b89bdb51a77140d84c3e0f/product.json")
    Call<Products> getProductList();

}
