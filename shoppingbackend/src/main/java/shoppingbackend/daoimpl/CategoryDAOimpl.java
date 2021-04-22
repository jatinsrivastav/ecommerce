package shoppingbackend.daoimpl;

import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Repository;

import shoppingbackend.dao.CategoryDAO;
import shoppingbackend.dto.category;

@Repository("categoryDAO")
public class CategoryDAOimpl implements CategoryDAO {

	private static List<category> categories= new ArrayList<category>();
	
	static {
		category cat= new category();
		cat.setId(1);
		cat.setName("teli");
		cat.setDescription("this is teliv");
		cat.setImageURL("image.png");
		
		categories.add(cat);
		
		cat= new category();
		cat.setId(2);
		cat.setName("mobile");
		cat.setDescription("this is mobile");
		cat.setImageURL("mobile.png");
		
		categories.add(cat);
	}
	@Override
	public List<category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

}
