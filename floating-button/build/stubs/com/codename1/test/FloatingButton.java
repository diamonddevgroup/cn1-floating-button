package com.codename1.test;


/**
 *  Google material floating button like class, the color can be changed. It has
 *  twitter like multi commands that can receive individual actions.
 * 
 *  @author Diamond
 */
public class FloatingButton extends com.codename1.ui.Button {

	public static final char FONTICON_PAYPAL = 36;

	public static final char FONTICON_PLUS_1 = 43;

	public static final char FONTICON_MINUS_1 = 45;

	public static final char FONTICON_CALL = 55;

	public static final char FONTICON_HOME_1 = 8962;

	public static final char FONTICON_PAUSE_1 = 9097;

	public static final char FONTICON_STOP_1 = 9632;

	public static final char FONTICON_UP_DIR = 9652;

	public static final char FONTICON_PLAY_1 = 9654;

	public static final char FONTICON_RIGHT_DIR = 9656;

	public static final char FONTICON_DOWN_DIR = 9662;

	public static final char FONTICON_LEFT_DIR = 9666;

	public static final char FONTICON_STAR_1 = 9733;

	public static final char FONTICON_STAR_EMPTY = 9734;

	public static final char FONTICON_CHECK = 9745;

	public static final char FONTICON_HEART_EMPTY = 9825;

	public static final char FONTICON_HEART_1 = 9829;

	public static final char FONTICON_MUSIC_1 = 9835;

	public static final char FONTICON_FLAG_1 = 9873;

	public static final char FONTICON_COG_1 = 9881;

	public static final char FONTICON_KEY_1 = 9919;

	public static final char FONTICON_MAIL = 9993;

	public static final char FONTICON_EDIT_1 = 9997;

	public static final char FONTICON_PENCIL = 9998;

	public static final char FONTICON_PENCIL_1 = 9999;

	public static final char FONTICON_OK_1 = 10003;

	public static final char FONTICON_OK_CIRCLED = 10004;

	public static final char FONTICON_CANCEL = 10005;

	public static final char FONTICON_CANCEL_CIRCLED = 10006;

	public static final char FONTICON_PLUS_CIRCLED = 10133;

	public static final char FONTICON_MINUS_CIRCLED = 10134;

	public static final char FONTICON_FORWARD_1 = 10150;

	public static final char FONTICON_ZOOM_OUT = 57344;

	public static final char FONTICON_GLYPH_1 = 57345;

	public static final char FONTICON_WRENCH = 57346;

	public static final char FONTICON_WAVES = 57347;

	public static final char FONTICON_WARNING = 57348;

	public static final char FONTICON_VOLUME_UP = 57349;

	public static final char FONTICON_VOLUME_OFF = 57350;

	public static final char FONTICON_VOLUME_DOWN = 57351;

	public static final char FONTICON_VIEWPORT = 57352;

	public static final char FONTICON_USER = 57353;

	public static final char FONTICON_UPLOAD = 57355;

	public static final char FONTICON_UPLOAD_2 = 57356;

	public static final char FONTICON_TINT = 57359;

	public static final char FONTICON_TIME = 57360;

	public static final char FONTICON_TEXT = 57361;

	public static final char FONTICON_TAGS = 57364;

	public static final char FONTICON_TAG = 57365;

	public static final char FONTICON_TABLE = 57366;

	public static final char FONTICON_STRIKETHROUGH = 57367;

	public static final char FONTICON_STOP = 57368;

	public static final char FONTICON_STEP_FORWARD = 57369;

	public static final char FONTICON_STEP_BACKWARD = 57370;

	public static final char FONTICON_STARS = 57371;

	public static final char FONTICON_STAR = 57372;

	public static final char FONTICON_STAR_LINE = 57373;

	public static final char FONTICON_STAR_HALF = 57374;

	public static final char FONTICON_SORT = 57375;

	public static final char FONTICON_SORT_UP = 57376;

	public static final char FONTICON_SORT_DOWN = 57377;

	public static final char FONTICON_SOCIAL_ZERPLY = 57378;

	public static final char FONTICON_SOCIAL_YOUTUBE = 57379;

	public static final char FONTICON_SOCIAL_YELP = 57380;

	public static final char FONTICON_SOCIAL_YAHOO = 57381;

	public static final char FONTICON_SOCIAL_WORDPRESS = 57382;

	public static final char FONTICON_SOCIAL_VIRB = 57383;

	public static final char FONTICON_SOCIAL_VIMEO = 57384;

	public static final char FONTICON_SOCIAL_VIDDLER = 57385;

	public static final char FONTICON_SOCIAL_TWITTER = 57386;

	public static final char FONTICON_SOCIAL_TUMBLR = 57387;

	public static final char FONTICON_SOCIAL_STUMBLEUPON = 57388;

	public static final char FONTICON_SOCIAL_SOUNDCLOUD = 57389;

	public static final char FONTICON_SOCIAL_SKYPE = 57390;

	public static final char FONTICON_SOCIAL_SHARE_THIS = 57391;

	public static final char FONTICON_SOCIAL_QUORA = 57392;

	public static final char FONTICON_SOCIAL_PINTEREST = 57393;

	public static final char FONTICON_SOCIAL_PHOTOBUCKET = 57394;

	public static final char FONTICON_SOCIAL_PAYPAL = 57395;

	public static final char FONTICON_SOCIAL_MYSPACE = 57396;

	public static final char FONTICON_SOCIAL_LINKEDIN = 57397;

	public static final char FONTICON_SOCIAL_LAST_FM = 57398;

	public static final char FONTICON_SOCIAL_GROOVESHARK = 57399;

	public static final char FONTICON_SOCIAL_GOOGLE_PLUS = 57400;

	public static final char FONTICON_SOCIAL_GITHUB = 57401;

	public static final char FONTICON_SOCIAL_FLICKR = 57403;

	public static final char FONTICON_SOCIAL_FACEBOOK = 57404;

	public static final char FONTICON_SOCIAL_EVERNOTE = 57405;

	public static final char FONTICON_SOCIAL_ENVATO = 57406;

	public static final char FONTICON_SOCIAL_EMAIL = 57407;

	public static final char FONTICON_SOCIAL_DRIBBBLE = 57408;

	public static final char FONTICON_SOCIAL_DIGG = 57409;

	public static final char FONTICON_SOCIAL_DEVIANT_ART = 57410;

	public static final char FONTICON_SOCIAL_BLOGGER = 57411;

	public static final char FONTICON_SOCIAL_BEHANCE = 57412;

	public static final char FONTICON_SOCIAL_BEBO = 57413;

	public static final char FONTICON_SOCIAL_ADDTHIS = 57414;

	public static final char FONTICON_SOCIAL_500PX = 57415;

	public static final char FONTICON_SITEMAP = 57416;

	public static final char FONTICON_SIGNOUT = 57417;

	public static final char FONTICON_SIGNIN = 57418;

	public static final char FONTICON_SIGNAL = 57419;

	public static final char FONTICON_SHOPPING_CART = 57420;

	public static final char FONTICON_SEARCH = 57421;

	public static final char FONTICON_RSS = 57422;

	public static final char FONTICON_ROAD = 57423;

	public static final char FONTICON_RETWEET = 57424;

	public static final char FONTICON_RESIZE_VERTICAL = 57425;

	public static final char FONTICON_RESIZE_VERTICAL_2 = 57426;

	public static final char FONTICON_RESIZE_SMALL = 57427;

	public static final char FONTICON_RESIZE_HORIZONTAL = 57428;

	public static final char FONTICON_RESIZE_HORIZONTAL_2 = 57429;

	public static final char FONTICON_RESIZE_FULLSCREEN = 57430;

	public static final char FONTICON_RESIZE_FULL = 57431;

	public static final char FONTICON_REPEAT = 57432;

	public static final char FONTICON_REORDER = 57433;

	public static final char FONTICON_REMOVE = 57434;

	public static final char FONTICON_REMOVE_SIGN = 57435;

	public static final char FONTICON_REMOVE_CIRCLE = 57436;

	public static final char FONTICON_READ_MORE = 57437;

	public static final char FONTICON_RANDOM = 57438;

	public static final char FONTICON_QUESTION_SIGN = 57439;

	public static final char FONTICON_PUSHPIN = 57440;

	public static final char FONTICON_PUSHPIN_2 = 57441;

	public static final char FONTICON_PRINT = 57442;

	public static final char FONTICON_PLUS = 57443;

	public static final char FONTICON_PLUS_SIGN = 57444;

	public static final char FONTICON_PLAY = 57445;

	public static final char FONTICON_PICTURE = 57446;

	public static final char FONTICON_PHONE = 57447;

	public static final char FONTICON_PHONE_SIGN = 57448;

	public static final char FONTICON_PHONE_BOXED = 57449;

	public static final char FONTICON_PAUSE = 57450;

	public static final char FONTICON_PASTE = 57451;

	public static final char FONTICON_PAPER_CLIP = 57452;

	public static final char FONTICON_OK = 57453;

	public static final char FONTICON_OK_SIGN = 57454;

	public static final char FONTICON_OK_CIRCLE = 57455;

	public static final char FONTICON_MUSIC = 57456;

	public static final char FONTICON_MOVE = 57457;

	public static final char FONTICON_MONEY = 57458;

	public static final char FONTICON_MINUS = 57459;

	public static final char FONTICON_MINUS_SIGN = 57460;

	public static final char FONTICON_MAP = 57461;

	public static final char FONTICON_MAP_MARKER = 57462;

	public static final char FONTICON_MAP_MARKER_2 = 57463;

	public static final char FONTICON_MAGNET = 57464;

	public static final char FONTICON_MAGIC = 57465;

	public static final char FONTICON_LOCK = 57466;

	public static final char FONTICON_LIST_3 = 57468;

	public static final char FONTICON_LINK = 57470;

	public static final char FONTICON_LAYER = 57471;

	public static final char FONTICON_KEY = 57472;

	public static final char FONTICON_ITALIC = 57473;

	public static final char FONTICON_INFO = 57474;

	public static final char FONTICON_INDENT_RIGHT = 57475;

	public static final char FONTICON_INDENT_LEFT = 57476;

	public static final char FONTICON_INBOX = 57477;

	public static final char FONTICON_INBOX_EMPTY = 57478;

	public static final char FONTICON_HOME = 57479;

	public static final char FONTICON_HEART = 57480;

	public static final char FONTICON_HEART_LINE = 57481;

	public static final char FONTICON_HEADPHONES = 57482;

	public static final char FONTICON_HEADPHONES_LINE = 57483;

	public static final char FONTICON_HEADPHONES_LINE_2 = 57484;

	public static final char FONTICON_HEADPHONES_2 = 57485;

	public static final char FONTICON_HDD = 57486;

	public static final char FONTICON_GROUP = 57487;

	public static final char FONTICON_GRID = 57488;

	public static final char FONTICON_GRID_LARGE = 57489;

	public static final char FONTICON_GLOBE_LINE = 57490;

	public static final char FONTICON_GLASS = 57491;

	public static final char FONTICON_GLASS_2 = 57492;

	public static final char FONTICON_GIFT = 57493;

	public static final char FONTICON_FORWARD = 57494;

	public static final char FONTICON_FONT = 57495;

	public static final char FONTICON_FOLDER_OPEN = 57496;

	public static final char FONTICON_FOLDER_CLOSE = 57497;

	public static final char FONTICON_FLAG = 57498;

	public static final char FONTICON_FIRE = 57499;

	public static final char FONTICON_FILM = 57500;

	public static final char FONTICON_FILE = 57501;

	public static final char FONTICON_FILE_EMPTY = 57502;

	public static final char FONTICON_FAST_FORWARD = 57503;

	public static final char FONTICON_FAST_BACKWARD = 57504;

	public static final char FONTICON_FACETIME = 57505;

	public static final char FONTICON_EYE = 57506;

	public static final char FONTICON_EYE_DISABLE = 57507;

	public static final char FONTICON_EXPAND_VIEW = 57508;

	public static final char FONTICON_EXPAND_VIEW_3 = 57509;

	public static final char FONTICON_EXPAND_VIEW_2 = 57510;

	public static final char FONTICON_EXPAND_VERTICAL = 57511;

	public static final char FONTICON_EXPAND_HORIZONTAL = 57512;

	public static final char FONTICON_EXCLAMATION = 57513;

	public static final char FONTICON_EMAIL = 57514;

	public static final char FONTICON_EMAIL_2 = 57515;

	public static final char FONTICON_EJECT = 57516;

	public static final char FONTICON_EDIT = 57517;

	public static final char FONTICON_EDIT_CHECK = 57518;

	public static final char FONTICON_DOWNLOAD = 57519;

	public static final char FONTICON_DOWNLOAD_2 = 57520;

	public static final char FONTICON_DASHBOARD = 57521;

	public static final char FONTICON_CREDIT_CARD = 57522;

	public static final char FONTICON_COPY = 57523;

	public static final char FONTICON_COMMENTS = 57524;

	public static final char FONTICON_COMMENTS_LINE = 57525;

	public static final char FONTICON_COMMENT = 57526;

	public static final char FONTICON_COMMENT_LINE = 57527;

	public static final char FONTICON_COGS = 57530;

	public static final char FONTICON_COG = 57531;

	public static final char FONTICON_CLOUD = 57532;

	public static final char FONTICON_CHECK_1 = 57533;

	public static final char FONTICON_CHECK_EMPTY = 57534;

	public static final char FONTICON_CERTIFICATE = 57535;

	public static final char FONTICON_CAMERA = 57536;

	public static final char FONTICON_PLUS_2 = 57537;

	public static final char FONTICON_BULLHORN = 57538;

	public static final char FONTICON_BRIEFCASE = 57539;

	public static final char FONTICON_BOOKMARK = 57540;

	public static final char FONTICON_BOOK = 57541;

	public static final char FONTICON_BOLT = 57542;

	public static final char FONTICON_BOLD = 57543;

	public static final char FONTICON_BLOCKQUOTE = 57544;

	public static final char FONTICON_BELL = 57545;

	public static final char FONTICON_BEAKER = 57546;

	public static final char FONTICON_BARCODE = 57547;

	public static final char FONTICON_BAN_CIRCLE = 57548;

	public static final char FONTICON_BAN_CHART = 57549;

	public static final char FONTICON_BAN_CHART_2 = 57550;

	public static final char FONTICON_BACKWARD = 57551;

	public static final char FONTICON_ASTERISK = 57552;

	public static final char FONTICON_ARROW_SIMPLE_UP = 57553;

	public static final char FONTICON_ARROW_SIMPLE_UP_CIRCLE = 57554;

	public static final char FONTICON_ARROW_SIMPLE_RIGHT = 57555;

	public static final char FONTICON_ARROW_SIMPLE_RIGHT_CIRCLE = 57556;

	public static final char FONTICON_ARROW_SIMPLE_LEFT = 57557;

	public static final char FONTICON_ARROW_SIMPLE_LEFT_CIRCLE = 57558;

	public static final char FONTICON_ARROW_SIMPLE_DOWN = 57559;

	public static final char FONTICON_ARROW_SIMPLE_DOWN_CIRCLE = 57560;

	public static final char FONTICON_ARROW_ROUND_UP = 57561;

	public static final char FONTICON_ARROW_ROUND_UP_CIRCLE = 57562;

	public static final char FONTICON_ARROW_ROUND_RIGHT = 57563;

	public static final char FONTICON_ARROW_ROUND_RIGHT_CIRCLE = 57564;

	public static final char FONTICON_ARROW_ROUND_LEFT = 57565;

	public static final char FONTICON_ARROW_ROUND_LEFT_CIRCLE = 57566;

	public static final char FONTICON_ARROW_ROUND_DOWN = 57567;

	public static final char FONTICON_ARROW_ROUND_DOWN_CIRCLE = 57568;

	public static final char FONTICON_ARROW_LIGHT_UP = 57569;

	public static final char FONTICON_ARROW_LIGHT_ROUND_UP = 57570;

	public static final char FONTICON_ARROW_LIGHT_ROUND_UP_CIRCLE = 57571;

	public static final char FONTICON_ARROW_LIGHT_ROUND_RIGHT = 57572;

	public static final char FONTICON_ARROW_LIGHT_ROUND_RIGHT_CIRCLE = 57573;

	public static final char FONTICON_ARROW_LIGHT_ROUND_LEFT = 57574;

	public static final char FONTICON_ARROW_LIGHT_ROUND_LEFT_CIRCLE = 57575;

	public static final char FONTICON_ARROW_LIGHT_ROUND_DOWN = 57576;

	public static final char FONTICON_ARROW_LIGHT_ROUND_DOWN_CIRCLE = 57577;

	public static final char FONTICON_ARROW_LIGHT_RIGHT = 57578;

	public static final char FONTICON_ARROW_LIGHT_LEFT = 57579;

	public static final char FONTICON_ARROW_LIGHT_DOWN = 57580;

	public static final char FONTICON_ALIGN_RIGHT = 57581;

	public static final char FONTICON_ALIGN_LEFT = 57582;

	public static final char FONTICON_ALIGN_JUSTIFY = 57583;

	public static final char FONTICON_ALIGN_CENTER = 57584;

	public static final char FONTICON_ADJUST = 57585;

	public static final char FONTICON_USER_6 = 57619;

	public static final char FONTICON_STAR_HALF_1 = 59137;

	public static final char FONTICON_OK_CIRCLED2 = 59138;

	public static final char FONTICON_CANCEL_CIRCLED2 = 59139;

	public static final char FONTICON_HELP_CIRCLED = 59140;

	public static final char FONTICON_INFO_CIRCLED = 59141;

	public static final char FONTICON_EYE_1 = 59146;

	public static final char FONTICON_EYE_OFF = 59147;

	public static final char FONTICON_TAG_1 = 59148;

	public static final char FONTICON_TAGS_1 = 59149;

	public static final char FONTICON_CAMERA_ALT = 59151;

	public static final char FONTICON_REPLY_1 = 59154;

	public static final char FONTICON_PRINT_1 = 59158;

	public static final char FONTICON_RETWEET_1 = 59159;

	public static final char FONTICON_COMMENT_1 = 59160;

	public static final char FONTICON_CHAT = 59168;

	public static final char FONTICON_LOCATION_1 = 59172;

	public static final char FONTICON_LOCATION_INV = 59173;

	public static final char FONTICON_DOWN_OPEN = 59228;

	public static final char FONTICON_LEFT_OPEN = 59229;

	public static final char FONTICON_RIGHT_OPEN = 59230;

	public static final char FONTICON_UP_OPEN = 59231;

	public static final char FONTICON_DOWN_OPEN_MINI = 59232;

	public static final char FONTICON_LEFT_OPEN_MINI = 59233;

	public static final char FONTICON_RIGHT_OPEN_MINI = 59234;

	public static final char FONTICON_UP_OPEN_MINI = 59235;

	public static final char FONTICON_DOWN_OPEN_BIG = 59236;

	public static final char FONTICON_LEFT_OPEN_BIG = 59237;

	public static final char FONTICON_RIGHT_OPEN_BIG = 59238;

	public static final char FONTICON_UP_OPEN_BIG = 59239;

	public static final char FONTICON_DOT_2 = 59276;

	public static final char FONTICON_DOT_3 = 59277;

	public static final char FONTICON_EQUALIZER = 59285;

	public static final char FONTICON_PAPER_PLANE_1 = 59291;

	public static final char FONTICON_DOWN_MICRO = 59303;

	public static final char FONTICON_UP_MICRO = 59304;

	public static final char FONTICON_BELL_2 = 59392;

	public static final char FONTICON_HOME_2 = 59393;

	public static final char FONTICON_HOME_3 = 59394;

	public static final char FONTICON_TAG_2 = 59395;

	public static final char FONTICON_HEART_4 = 59396;

	public static final char FONTICON_HEART_EMPTY_1 = 59397;

	public static final char FONTICON_LOCATION_2 = 59398;

	public static final char FONTICON_COMPASS = 59399;

	public static final char FONTICON_TAGS_2 = 59400;

	public static final char FONTICON_TAG_3 = 59401;

	public static final char FONTICON_POST = 59402;

	public static final char FONTICON_STAR_3 = 59403;

	public static final char FONTICON_HOME_4 = 59404;

	public static final char FONTICON_HOME_5 = 59405;

	public static final char FONTICON_HOME_OUTLINE = 59406;

	public static final char FONTICON_USERS_2 = 59407;

	public static final char FONTICON_USERS_OUTLINE = 59408;

	public static final char FONTICON_DOWN_OPEN_2 = 59409;

	public static final char FONTICON_LEFT_OPEN_2 = 59410;

	public static final char FONTICON_RIGHT_OPEN_2 = 59411;

	public static final char FONTICON_DOWN_DIR_1 = 59412;

	public static final char FONTICON_LEFT_DIR_1 = 59413;

	public static final char FONTICON_RIGHT_DIR_1 = 59414;

	public static final char FONTICON_UP_DIR_1 = 59415;

	public static final char FONTICON_PLAY_2 = 59416;

	public static final char FONTICON_HEART_FILLED = 59417;

	public static final char FONTICON_STAR_2 = 59418;

	public static final char FONTICON_STAR_FILLED = 59419;

	public static final char FONTICON_CAMERA_OUTLINE = 59420;

	public static final char FONTICON_CAMERA_2 = 59421;

	public static final char FONTICON_MIC_OUTLINE = 59422;

	public static final char FONTICON_LOCATION = 59423;

	public static final char FONTICON_UP_OPEN_2 = 59424;

	public static final char FONTICON_HEART_2 = 59425;

	public static final char FONTICON_SEARCH_2 = 59426;

	public static final char FONTICON_USER_2 = 59427;

	public static final char FONTICON_HEART_3 = 59428;

	public static final char FONTICON_MAIL_2 = 59429;

	public static final char FONTICON_USER_4 = 59430;

	public static final char FONTICON_LOCK_OPEN_1 = 59431;

	public static final char FONTICON_LOCK_2 = 59432;

	public static final char FONTICON_OK_CIRCLE_1 = 59433;

	public static final char FONTICON_CANCEL_CIRCLE = 59434;

	public static final char FONTICON_PLUS_CIRCLE = 59435;

	public static final char FONTICON_MINUS_CIRCLE = 59436;

	public static final char FONTICON_EYE_2 = 59437;

	public static final char FONTICON_EYE_OUTLINE = 59438;

	public static final char FONTICON_CANCEL_CIRCLED_1 = 59439;

	public static final char FONTICON_SPIN1 = 59440;

	public static final char FONTICON_SPIN2 = 59441;

	public static final char FONTICON_SPIN3 = 59442;

	public static final char FONTICON_INFO_CIRCLED_2 = 59443;

	public static final char FONTICON_SPIN4 = 59444;

	public static final char FONTICON_INFO_3 = 59445;

	public static final char FONTICON_CAMERA_3 = 59446;

	public static final char FONTICON_MAIL_3 = 59447;

	public static final char FONTICON_SPIN5 = 59448;

	public static final char FONTICON_SPIN6 = 59449;

	public static final char FONTICON_USERS_3 = 59450;

	public static final char FONTICON_PHONE_2 = 59451;

	public static final char FONTICON_SEARCH_4 = 59452;

	public static final char FONTICON_SEARCH_5 = 59453;

	public static final char FONTICON_DOWN_DIR_2 = 59454;

	public static final char FONTICON_DOWN_DIR_3 = 59455;

	public static final char FONTICON_UP_DIR_2 = 59456;

	public static final char FONTICON_PAPER_PLANE_2 = 59457;

	public static final char FONTICON_SHARE = 59458;

	public static final char FONTICON_DELETE = 59459;

	public static final char FONTICON_ADD = 59460;

	public static final char FONTICON_CROWN_PLUS = 59461;

	public static final char FONTICON_FORWARD_2 = 59462;

	public static final char FONTICON_MARQUEE = 59463;

	public static final char FONTICON_MINUS_2 = 59464;

	public static final char FONTICON_REPLY_2 = 59465;

	public static final char FONTICON_CLOSE_2 = 59466;

	public static final char FONTICON_CLOSE = 59467;

	public static final char FONTICON_STOP_2 = 59468;

	public static final char FONTICON_PLACHOLDER = 59469;

	public static final char FONTICON_OK_2 = 59470;

	public static final char FONTICON_MAIL_CIRCLED = 59471;

	public static final char FONTICON_ANNOUNCEMENT_ICON = 59677;

	public static final char FONTICON_PEN_ICON = 59678;

	public static final char FONTICON_SIDE_MENU = 59679;

	public static final char FONTICON_NOTIFICATION_ICON = 59680;

	public static final char FONTICON_LIST_ICON = 59681;

	public static final char FONTICON_FORUM_ICON = 59682;

	public static final char FONTICON_CHAT_ICON = 59683;

	public static final char FONTICON_SHOW = 59684;

	public static final char FONTICON_KEYHOLE = 59687;

	public static final char FONTICON_PLACEHOLDER = 59688;

	public static final char FONTICON_USER_7 = 59689;

	public static final char FONTICON_CHECK_2 = 59976;

	public static final char FONTICON_CHECK_3 = 59977;

	public static final char FONTICON_CHECK_4 = 59978;

	public static final char FONTICON_DOWN_OPEN_1 = 61444;

	public static final char FONTICON_UP_OPEN_1 = 61445;

	public static final char FONTICON_RIGHT_OPEN_1 = 61446;

	public static final char FONTICON_LEFT_OPEN_1 = 61447;

	public static final char FONTICON_USER_3 = 61537;

	public static final char FONTICON_USER_MALE = 61538;

	public static final char FONTICON_USER_FEMALE = 61539;

	public static final char FONTICON_USERS_1 = 61540;

	public static final char FONTICON_LINK_EXT = 61582;

	public static final char FONTICON_CHECK_EMPTY_1 = 61590;

	public static final char FONTICON_BOOKMARK_EMPTY = 61591;

	public static final char FONTICON_MENU = 61641;

	public static final char FONTICON_MAIL_ALT = 61664;

	public static final char FONTICON_COMMENT_EMPTY = 61669;

	public static final char FONTICON_CHAT_EMPTY = 61670;

	public static final char FONTICON_DOWNLOAD_CLOUD = 61677;

	public static final char FONTICON_UPLOAD_CLOUD = 61678;

	public static final char FONTICON_BELL_ALT = 61683;

	public static final char FONTICON_PLUS_SQUARED = 61694;

	public static final char FONTICON_ANGLE_LEFT = 61700;

	public static final char FONTICON_ANGLE_RIGHT = 61701;

	public static final char FONTICON_ANGLE_UP = 61702;

	public static final char FONTICON_ANGLE_DOWN = 61703;

	public static final char FONTICON_QUOTE_LEFT = 61709;

	public static final char FONTICON_QUOTE_RIGHT = 61710;

	public static final char FONTICON_SPINNER = 61712;

	public static final char FONTICON_REPLY = 61714;

	public static final char FONTICON_GAMEPAD = 61723;

	public static final char FONTICON_KEYBOARD = 61724;

	public static final char FONTICON_FLAG_EMPTY = 61725;

	public static final char FONTICON_FLAG_CHECKERED = 61726;

	public static final char FONTICON_CODE = 61729;

	public static final char FONTICON_REPLY_ALL = 61730;

	public static final char FONTICON_STAR_HALF_ALT = 61731;

	public static final char FONTICON_UNLINK = 61735;

	public static final char FONTICON_HELP = 61736;

	public static final char FONTICON_INFO_1 = 61737;

	public static final char FONTICON_ATTENTION_ALT = 61738;

	public static final char FONTICON_LOCK_OPEN_ALT = 61758;

	public static final char FONTICON_ELLIPSIS = 61761;

	public static final char FONTICON_ELLIPSIS_VERT = 61762;

	public static final char FONTICON_MINUS_SQUARED = 61766;

	public static final char FONTICON_MINUS_SQUARED_ALT = 61767;

	public static final char FONTICON_OK_SQUARED = 61770;

	public static final char FONTICON_PENCIL_SQUARED = 61771;

	public static final char FONTICON_LINK_EXT_ALT = 61772;

	public static final char FONTICON_THUMBS_UP_ALT = 61796;

	public static final char FONTICON_THUMBS_DOWN_ALT = 61797;

	public static final char FONTICON_FEMALE = 61826;

	public static final char FONTICON_MALE = 61827;

	public static final char FONTICON_DOT_CIRCLED = 61842;

	public static final char FONTICON_PLUS_SQUARED_ALT = 61846;

	public static final char FONTICON_MAIL_SQUARED = 61849;

	public static final char FONTICON_CHILD = 61870;

	public static final char FONTICON_CIRCLE_NOTCH = 61902;

	public static final char FONTICON_PAPER_PLANE = 61912;

	public static final char FONTICON_PAPER_PLANE_EMPTY = 61913;

	public static final char FONTICON_CIRCLE_THIN = 61915;

	public static final char FONTICON_SHARE_SQUARED = 61921;

	public static final char FONTICON_BELL_OFF = 61942;

	public static final char FONTICON_BELL_OFF_EMPTY = 61943;

	public static final char FONTICON_TOGGLE_OFF = 61956;

	public static final char FONTICON_TOGGLE_ON = 61957;

	public static final char FONTICON_USER_SECRET = 61979;

	public static final char FONTICON_SOCIAL_WHATSAPP = 62002;

	public static final char FONTICON_USER_PLUS = 62004;

	public static final char FONTICON_USER_TIMES = 62005;

	public static final char FONTICON_PICTURE_1 = 62212;

	public static final char FONTICON_VIMEO_CIRCLED = 62215;

	public static final char FONTICON_TWITTER = 62217;

	public static final char FONTICON_TWITTER_CIRCLED = 62218;

	public static final char FONTICON_FACEBOOK = 62220;

	public static final char FONTICON_FACEBOOK_CIRCLED = 62221;

	public static final char FONTICON_GPLUS = 62223;

	public static final char FONTICON_GPLUS_CIRCLED = 62224;

	public static final char FONTICON_PINTEREST = 62226;

	public static final char FONTICON_PINTEREST_CIRCLED = 62227;

	public static final char FONTICON_TUMBLR = 62229;

	public static final char FONTICON_TUMBLR_CIRCLED = 62230;

	public static final char FONTICON_LINKEDIN_CIRCLED = 62233;

	public static final char FONTICON_SOCIAL_INSTAGRAM_1 = 62238;

	public static final char FONTICON_SOCIAL_INSTAGRAM = 62253;

	public static final char FONTICON_GLASS_1 = 62328;

	public static final char FONTICON_MIC = 62372;

	public static final char FONTICON_VIDEOCAM = 62373;

	public static final char FONTICON_VIDEO = 62380;

	public static final char FONTICON_THUMBS_UP = 62541;

	public static final char FONTICON_THUMBS_DOWN = 62542;

	public static final char FONTICON_USER_1 = 62564;

	public static final char FONTICON_USERS = 62565;

	public static final char FONTICON_USER_WOMAN = 62569;

	public static final char FONTICON_USER_PAIR = 62571;

	public static final char FONTICON_PIN = 62668;

	public static final char FONTICON_ATTACH = 62670;

	public static final char FONTICON_PHONE_1 = 62686;

	public static final char FONTICON_MEGAPHONE = 62691;

	public static final char FONTICON_DOWNLOAD_1 = 62693;

	public static final char FONTICON_MOBILE = 62705;

	public static final char FONTICON_CAMERA_1 = 62711;

	public static final char FONTICON_SEARCH_1 = 62720;

	public static final char FONTICON_SEARCH_3 = 62733;

	public static final char FONTICON_KEY_INV = 62737;

	public static final char FONTICON_LOCK_1 = 62738;

	public static final char FONTICON_LOCK_OPEN = 62739;

	public static final char FONTICON_BELL_1 = 62740;

	public static final char FONTICON_BOOKMARK_1 = 62742;

	public static final char FONTICON_LINK_1 = 62743;

	public static final char FONTICON_USER_5 = 62566;

	public static final char FONTICON_UPLOAD_1 = 62692;

	/**
	 *  FloatingButton.BOTTOM_RIGHT displays the button at the bottom right
	 *  corner
	 */
	public static final int BOTTOM_RIGHT = 1;

	/**
	 *  FloatingButton.BOTTOM_RIGHT displays the button at the bottom left corner
	 */
	public static final int BOTTOM_LEFT = 2;

	/**
	 *  FloatingButton.BOTTOM_RIGHT displays the button at the bottom center
	 */
	public static final int BOTTOM_CENTER = 3;

	/**
	 *  Construct a floating button with pen icon and without multi commands
	 * 
	 *  @param defaultCommand the default action the floating button should
	 *  perform
	 */
	public FloatingButton(com.codename1.ui.Command defaultCommand) {
	}

	/**
	 *  Construct a floating button with the specified icon
	 * 
	 *  @param defaultCommand the default action the floating button should
	 *  perform
	 *  @param icon the floating button icon character code, e.g. '?',
	 *  defaults to FloatingButton.FONTICON_PENCIL
	 */
	public FloatingButton(com.codename1.ui.Command defaultCommand, Character icon) {
	}

	/**
	 *  Construct a floating button with the specified icon and multi commands
	 * 
	 *  @param defaultCommand the default action the floating button should
	 *  perform
	 *  @param icon the floating button icon character code, e.g. '?',
	 *  defaults to FloatingButton.FONTICON_PENCIL
	 *  @param floatingCommands optional commands to be shown when floating
	 *  button is pressed
	 */
	public FloatingButton(com.codename1.ui.Command defaultCommand, Character icon, java.util.Map floatingCommands) {
	}

	/**
	 * 
	 *  @return the size of the floating button
	 */
	public int getSize() {
	}

	/**
	 *  Set the size of the floating button icon
	 * 
	 *  @param size the size of the floating button icon, default to 4
	 */
	public void setSize(int size) {
	}

	/**
	 * 
	 *  @return the color of the floating button icon
	 */
	public int getColor() {
	}

	/**
	 *  Set the color the floating button icon
	 * 
	 *  @param color the color of the floating button icon
	 */
	public void setColor(int color) {
	}

	/**
	 * 
	 *  @return the position of the floating button
	 */
	public int getPosition() {
	}

	/**
	 *  Set the position where the floating button should be placed
	 * 
	 *  @param position One of BOTTOM_RIGHT, BOTTOM_LEFT, BOTTOM_CENTER
	 */
	public void setPosition(int position) {
	}

	/**
	 *  Draw the button using the background color and transparency of
	 *  "FloatingButton" uiid
	 */
	protected void drawButton() {
	}

	/**
	 *  Add floating button to specified position
	 * 
	 *  @param f the form to add the floating button to
	 *  @param position the position where the floating button should be placed.
	 *  One of FloatingButton.BOTTOM_RIGHT, FloatingButton.BOTTOM_LEFT,
	 *  FloatingButton.BOTTOM_CENTER
	 */
	public void addToForm(com.codename1.ui.Form f, int position) {
	}

	/**
	 *  Add floating button to default bottom right position
	 * 
	 *  @param f the form to add the floating button to
	 */
	public void addToForm(com.codename1.ui.Form f) {
	}
}
