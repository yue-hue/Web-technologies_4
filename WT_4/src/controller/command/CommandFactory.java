package controller.command;

import controller.command.admin.AddRoom;
import controller.command.admin.VacateRoom;
import controller.command.admin.ShowRooms;
import controller.command.common.*;
import controller.command.user.MainPage;
import controller.command.user.MakeOrder;

public class CommandFactory {
    private static final CommandFactory INSTANCE = new CommandFactory();
    private static final String MAIN_PAGE = "mainPage";
    private static final String MAKE_ORDER = "makeOrder";
    private static final String LOGIN = "login";
    private static final String SHOW_ROOMS = "showRooms";
    private static final String CHANGE_LANGUAGE = "changeLanguage";
    private static final String ADD_ROOM = "addRoom";
    private static final String DEOCCUPY_ROOM = "deoccupyRoom";
    private static final String LOG_OUT = "signOut";
    private static final String SIGN_UP = "signUp";
    private static final String START_PAGE = "startPage";
    private static final String START_LOGIN = "startLogin";

    private CommandFactory() {
    }

    public static CommandFactory getInstance() {
        return INSTANCE;
    }

    public Command getCommand(String command) {
        switch (command) {
            case LOGIN:
                return new LogIn();
            case SHOW_ROOMS:
                return new ShowRooms();
            case MAIN_PAGE:
                return new MainPage();
            case CHANGE_LANGUAGE:
                return new ChangeLanguage();
            case ADD_ROOM:
                return new AddRoom();
            case MAKE_ORDER:
                return new MakeOrder();
            case DEOCCUPY_ROOM:
                return new VacateRoom();
            case LOG_OUT:
                return new LogOut();
            case START_PAGE:
                return new StartPage();
            case SIGN_UP:
                return new SignUp();
            case START_LOGIN:
                return new StartLogIn();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
