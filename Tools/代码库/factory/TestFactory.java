package brave.qiu.factory;

import brave.qiu.dao.IFoodTypeDao;
/**
 * �ýӿڵ�����װʵ�������
 * @author Administrator
 *
 */
public class TestFactory {
		//ʹ�ù�����������
	private IFoodTypeDao foodTypeDao = BeanFactory.
			getInstance("foodtypeDao",IFoodTypeDao.class);
}
