package com.example.demo.bootstrap;

import com.example.demo.domain.InhousePart;
import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {

       /*
        OutsourcedPart o= new OutsourcedPart();
        o.setCompanyName("Western Governors University");
        o.setName("out test");
        o.setInv(5);
        o.setPrice(20.0);
        o.setId(100L);
        outsourcedPartRepository.save(o);
        OutsourcedPart thePart=null;
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("out test"))thePart=part;
        }

        System.out.println(thePart.getCompanyName());
        */
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            System.out.println(part.getName()+" "+part.getCompanyName());
        }

        /*
        Product bicycle= new Product("bicycle",100.0,15);
        Product unicycle= new Product("unicycle",100.0,15);
        productRepository.save(bicycle);
        productRepository.save(unicycle);
        */
        
        
        //Inserted code for Part E starts here
        if (productRepository.count() == 0) { //load product inventory only of no inventory is present
           
            Product trail = new Product("Trail Saddle",2399.99,5);
            Product cut = new Product("Cutting Saddle",3700.00,5);
            Product rope = new Product("Roping Saddle",2985.00,5);
            Product show = new Product("Show Saddle", 6399.00,5);
            Product english = new Product("English Saddle",1999.00,5);

            productRepository.save(trail);
            productRepository.save(cut);
            productRepository.save(rope);
            productRepository.save(show);
            productRepository.save(english);
           
        }
        else {
            System.out.println("Product inventory already present. No additions made.");
        }

        if (partRepository.count() == 0) { //load part inventory only if no inventory is present

            InhousePart bag = new InhousePart();
            bag.setName("Saddle Bags");
            bag.setPrice(239.99);
            bag.setInv(5);
            bag.setMinInv(2);
            bag.setMaxInv(7);

            InhousePart cinch = new InhousePart();
            cinch.setName("Front Cinch");
            cinch.setPrice(37.99);
            cinch.setInv(5);
            cinch.setMinInv(2);
            cinch.setMaxInv(7);

            InhousePart strap = new InhousePart();
            strap.setName("Bucking Strap");
            strap.setPrice(79.99);
            strap.setInv(5);
            strap.setMinInv(2);
            strap.setMaxInv(7);

            InhousePart head = new InhousePart();
            head.setName("Head Stall");
            head.setPrice(107.99);
            head.setInv(5);
            head.setMinInv(2);
            head.setMaxInv(7);

            InhousePart rein = new InhousePart();
            rein.setName("Leather Reins");
            rein.setPrice(65.00);
            rein.setInv(5);
            rein.setMinInv(2);
            rein.setMaxInv(7);

            partRepository.save(bag);
            partRepository.save(cinch);
            partRepository.save(strap);
            partRepository.save(head);
            partRepository.save(rein);

        }
        else {
            System.out.println("Part inventory already present. No additions made.");
        }






        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());

    }
}
