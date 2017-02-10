package by.nikolaev.ilya.barbershop.command.implRecord;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.nikolaev.ilya.barbershop.bean.Record;
import by.nikolaev.ilya.barbershop.command.Command;
import by.nikolaev.ilya.barbershop.command.NameParametr;
import by.nikolaev.ilya.barbershop.command.exeption.CommandNotFoundException;
import by.nikolaev.ilya.barbershop.controller.NamePage;
import by.nikolaev.ilya.barbershop.service.RecordService;
import by.nikolaev.ilya.barbershop.service.ServiceFactory;

public class RecordUser implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws CommandNotFoundException {
		Record record = packingUser(request, response);
		String page = NamePage.INDEX_PAGE;

		ServiceFactory serviceFactory = ServiceFactory.getInstance();
		RecordService recordService = serviceFactory.getRecordService();

		try {
			record = recordService.signInRecord(record);
			if (record != null) {
				page = NamePage.RECORD_PAGE;
			} else {
				page = NamePage.ERROR_PAGE;
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

		return page;
	}

	private Record packingUser(HttpServletRequest request, HttpServletResponse response) {

		String name = request.getParameter(NameParametr.PRM_RECORD_NAME);
		String date = request.getParameter(NameParametr.PRM_RECORD_DATE);
		String time = request.getParameter(NameParametr.PRM_RECORD_TIME);
		String phone = request.getParameter(NameParametr.PRM_RECORD_PRONE);

		System.out.println(name);
		System.out.println(date);
		System.out.println(time);
		System.out.println(phone);

		Record record = new Record();
		record.setName(name);
		record.setData(date);
		record.setTime(time);
		record.setPhone(phone);

		return record;
	}

}
