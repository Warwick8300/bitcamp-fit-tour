package com.eomcs.lms.web.json;
import java.util.HashMap;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.eomcs.lms.domain.Member;
import com.eomcs.lms.service.TourService;

@RestController("json/TourWishListController")
@RequestMapping("/json/wishlist")
public class TourWishListController {

  @Autowired TourService tourService;


  //add Wish list
  @GetMapping("add")
  public Object add(String tourNo, HttpSession session) {
    Member loginUser = (Member) session.getAttribute("loginUser");
    HashMap<String,Object> content = new HashMap<String,Object>();
    HashMap<String,Object> paramMap = new HashMap<String,Object>();

    paramMap.put("tourNo", tourNo);
    paramMap.put("memberNo", loginUser.getNo());
    try {
      tourService.addWishlist(paramMap);
      content.put("status", "success");
    } catch (Exception e) {
      content.put("status", "fail");
      content.put("message", e.getMessage());
    }
    return content;
  }

}