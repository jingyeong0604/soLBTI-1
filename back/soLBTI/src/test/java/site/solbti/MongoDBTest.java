package site.solbti;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.mapping.Document;
import site.solbti.repository.MongoCommonCardRepository;
import site.solbti.vo.MongoCommonCard;

@SpringBootTest
public class MongoDBTest {
    @Autowired
    MongoCommonCardRepository mongoRepo;

    @Test
    public void dataTest() {
        System.out.println(mongoRepo.findAll());
    }

    //@Test
    public void insertTest() {
        MongoCommonCard mc = new MongoCommonCard();
        mc.setCommonCardCode(1003);
        mongoRepo.save(mc);
    }

    @Test
    public void select(){
        Document document = mongoRepo.findByCommonCardCode(1001L);
        System.out.println(document);
    }

}
