package by.nikolaev.ilya.barbershop.command;

public class NameParametr {

	// For User
	public static final String PRM_USER_NAME = "user_name";
	public static final String PRM_USER_SURNAME = "user_surname";
	public static final String PRM_USER_EMAIL = "user_email";
	public static final String PRM_USER_LOGIN = "user_login";
	public static final String PRM_USER_PASSWORD = "user_password";
	public static final String PRM_USER_REGIST_PASSWORD = "user_regist_password";
	public static final String PRM_USER_OLD_PASSWORD = "user_old_password";

	// For Record users on A haircut
	public static final String PRM_RECORD_DATE = "record_date";
	public static final String PRM_RECORD_TIME = "record_time";
	public static final String PRM_RECORD_NAME = "record_name";
	public static final String PRM_RECORD_PRONE = "record_phone";

	// For new News
	public static final String PRM_NEWS_TITLE = "news_title";
	public static final String PRM_NEWS_CONTENT = "news_content";

	// CommandHelper
	public static final String CMD_REGISTRATION = "registration";
	public static final String CMD_SIGN_IN = "signin";
	public static final String CMD_LOCALIZATION = "localization";
	public static final String CMD_RECORD = "record";
	public static final String CMD_SIGN_OUT = "signout";
	public static final String CMD_SHOW_NEWS = "showAllNews";
	public static final String CMD_ADD_NEWS = "new_news";

	// Servlet
	public static final String PRM_COMMAND = "command";

	// CommandHelper Admin
	public static final String CMD_SHOW_USER_LIST = "show_users";
	public static final String CMD_SIGN_IN_ADMIN = "signinAdmin";

}
