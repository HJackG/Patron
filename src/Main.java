import com.joaquin.product.control.ProductController;
import com.joaquin.product.model.repositories.ProductRepository;
import com.joaquin.product.view.ProductView;

public class Main {
    public static void main(String[] args) {

        ProductRepository productRepository = new ProductRepository();
        ProductView productView = new ProductView();

        ProductController productController = new ProductController(productView,productRepository);

        productController.createProduct();


    }
}