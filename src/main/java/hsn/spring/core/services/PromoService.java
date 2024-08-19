package hsn.spring.core.services;

import hsn.spring.core.repository.PromoRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PromoService {
    @Getter
    private PromoRepository promoRepository;

    @Autowired
    public void setPromoRepository(PromoRepository promoRepository) {
        this.promoRepository = promoRepository;
    }
}
