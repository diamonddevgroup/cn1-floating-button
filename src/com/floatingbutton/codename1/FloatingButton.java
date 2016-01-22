package com.floatingbutton.codename1;

import com.codename1.ui.Button;
import com.codename1.ui.Command;
import com.codename1.ui.Component;
import com.codename1.ui.Container;
import com.codename1.ui.Dialog;
import com.codename1.ui.Display;
import com.codename1.ui.Font;
import com.codename1.ui.FontImage;
import com.codename1.ui.Form;
import com.codename1.ui.Graphics;
import com.codename1.ui.Image;
import com.codename1.ui.animations.CommonTransitions;
import com.codename1.ui.geom.Rectangle;
import com.codename1.ui.layouts.BorderLayout;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.ui.layouts.FlowLayout;
import com.codename1.ui.layouts.LayeredLayout;
import com.codename1.ui.painter.BackgroundPainter;
import java.io.IOException;
import java.util.Map;

/**
 * Google material floating button like class, the color can be changed. It has
 * twitter like multi commands that can receive individual actions.
 *
 * @author Diamond
 */
public class FloatingButton extends Button {

    public static final char FONTICON_PAYPAL = '\u0024';
    public static final char FONTICON_PLUS_1 = '\u002B';
    public static final char FONTICON_MINUS_1 = '\u002D';
    public static final char FONTICON_CALL = '\u0037';
    public static final char FONTICON_HOME_1 = '\u2302';
    public static final char FONTICON_PAUSE_1 = '\u2389';
    public static final char FONTICON_STOP_1 = '\u25A0';
    public static final char FONTICON_UP_DIR = '\u25B4';
    public static final char FONTICON_PLAY_1 = '\u25B6';
    public static final char FONTICON_RIGHT_DIR = '\u25B8';
    public static final char FONTICON_DOWN_DIR = '\u25BE';
    public static final char FONTICON_LEFT_DIR = '\u25C2';
    public static final char FONTICON_STAR_1 = '\u2605';
    public static final char FONTICON_STAR_EMPTY = '\u2606';
    public static final char FONTICON_CHECK = '\u2611';
    public static final char FONTICON_HEART_EMPTY = '\u2661';
    public static final char FONTICON_HEART_1 = '\u2665';
    public static final char FONTICON_MUSIC_1 = '\u266B';
    public static final char FONTICON_FLAG_1 = '\u2691';
    public static final char FONTICON_COG_1 = '\u2699';
    public static final char FONTICON_KEY_1 = '\u26BF';
    public static final char FONTICON_MAIL = '\u2709';
    public static final char FONTICON_EDIT_1 = '\u270D';
    public static final char FONTICON_PENCIL = '\u270E';
    public static final char FONTICON_PENCIL_1 = '\u270F';
    public static final char FONTICON_OK_1 = '\u2713';
    public static final char FONTICON_OK_CIRCLED = '\u2714';
    public static final char FONTICON_CANCEL = '\u2715';
    public static final char FONTICON_CANCEL_CIRCLED = '\u2716';
    public static final char FONTICON_PLUS_CIRCLED = '\u2795';
    public static final char FONTICON_MINUS_CIRCLED = '\u2796';
    public static final char FONTICON_FORWARD_1 = '\u27A6';
    public static final char FONTICON_ZOOM_OUT = '\uE000';
    public static final char FONTICON_GLYPH_1 = '\uE001';
    public static final char FONTICON_WRENCH = '\uE002';
    public static final char FONTICON_WAVES = '\uE003';
    public static final char FONTICON_WARNING = '\uE004';
    public static final char FONTICON_VOLUME_UP = '\uE005';
    public static final char FONTICON_VOLUME_OFF = '\uE006';
    public static final char FONTICON_VOLUME_DOWN = '\uE007';
    public static final char FONTICON_VIEWPORT = '\uE008';
    public static final char FONTICON_USER = '\uE009';
    public static final char FONTICON_UPLOAD = '\uE00B';
    public static final char FONTICON_UPLOAD_2 = '\uE00C';
    public static final char FONTICON_TINT = '\uE00F';
    public static final char FONTICON_TIME = '\uE010';
    public static final char FONTICON_TEXT = '\uE011';
    public static final char FONTICON_TAGS = '\uE014';
    public static final char FONTICON_TAG = '\uE015';
    public static final char FONTICON_TABLE = '\uE016';
    public static final char FONTICON_STRIKETHROUGH = '\uE017';
    public static final char FONTICON_STOP = '\uE018';
    public static final char FONTICON_STEP_FORWARD = '\uE019';
    public static final char FONTICON_STEP_BACKWARD = '\uE01A';
    public static final char FONTICON_STARS = '\uE01B';
    public static final char FONTICON_STAR = '\uE01C';
    public static final char FONTICON_STAR_LINE = '\uE01D';
    public static final char FONTICON_STAR_HALF = '\uE01E';
    public static final char FONTICON_SORT = '\uE01F';
    public static final char FONTICON_SORT_UP = '\uE020';
    public static final char FONTICON_SORT_DOWN = '\uE021';
    public static final char FONTICON_SOCIAL_ZERPLY = '\uE022';
    public static final char FONTICON_SOCIAL_YOUTUBE = '\uE023';
    public static final char FONTICON_SOCIAL_YELP = '\uE024';
    public static final char FONTICON_SOCIAL_YAHOO = '\uE025';
    public static final char FONTICON_SOCIAL_WORDPRESS = '\uE026';
    public static final char FONTICON_SOCIAL_VIRB = '\uE027';
    public static final char FONTICON_SOCIAL_VIMEO = '\uE028';
    public static final char FONTICON_SOCIAL_VIDDLER = '\uE029';
    public static final char FONTICON_SOCIAL_TWITTER = '\uE02A';
    public static final char FONTICON_SOCIAL_TUMBLR = '\uE02B';
    public static final char FONTICON_SOCIAL_STUMBLEUPON = '\uE02C';
    public static final char FONTICON_SOCIAL_SOUNDCLOUD = '\uE02D';
    public static final char FONTICON_SOCIAL_SKYPE = '\uE02E';
    public static final char FONTICON_SOCIAL_SHARE_THIS = '\uE02F';
    public static final char FONTICON_SOCIAL_QUORA = '\uE030';
    public static final char FONTICON_SOCIAL_PINTEREST = '\uE031';
    public static final char FONTICON_SOCIAL_PHOTOBUCKET = '\uE032';
    public static final char FONTICON_SOCIAL_PAYPAL = '\uE033';
    public static final char FONTICON_SOCIAL_MYSPACE = '\uE034';
    public static final char FONTICON_SOCIAL_LINKEDIN = '\uE035';
    public static final char FONTICON_SOCIAL_LAST_FM = '\uE036';
    public static final char FONTICON_SOCIAL_GROOVESHARK = '\uE037';
    public static final char FONTICON_SOCIAL_GOOGLE_PLUS = '\uE038';
    public static final char FONTICON_SOCIAL_GITHUB = '\uE039';
    public static final char FONTICON_SOCIAL_FLICKR = '\uE03B';
    public static final char FONTICON_SOCIAL_FACEBOOK = '\uE03C';
    public static final char FONTICON_SOCIAL_EVERNOTE = '\uE03D';
    public static final char FONTICON_SOCIAL_ENVATO = '\uE03E';
    public static final char FONTICON_SOCIAL_EMAIL = '\uE03F';
    public static final char FONTICON_SOCIAL_DRIBBBLE = '\uE040';
    public static final char FONTICON_SOCIAL_DIGG = '\uE041';
    public static final char FONTICON_SOCIAL_DEVIANT_ART = '\uE042';
    public static final char FONTICON_SOCIAL_BLOGGER = '\uE043';
    public static final char FONTICON_SOCIAL_BEHANCE = '\uE044';
    public static final char FONTICON_SOCIAL_BEBO = '\uE045';
    public static final char FONTICON_SOCIAL_ADDTHIS = '\uE046';
    public static final char FONTICON_SOCIAL_500PX = '\uE047';
    public static final char FONTICON_SITEMAP = '\uE048';
    public static final char FONTICON_SIGNOUT = '\uE049';
    public static final char FONTICON_SIGNIN = '\uE04A';
    public static final char FONTICON_SIGNAL = '\uE04B';
    public static final char FONTICON_SHOPPING_CART = '\uE04C';
    public static final char FONTICON_SEARCH = '\uE04D';
    public static final char FONTICON_RSS = '\uE04E';
    public static final char FONTICON_ROAD = '\uE04F';
    public static final char FONTICON_RETWEET = '\uE050';
    public static final char FONTICON_RESIZE_VERTICAL = '\uE051';
    public static final char FONTICON_RESIZE_VERTICAL_2 = '\uE052';
    public static final char FONTICON_RESIZE_SMALL = '\uE053';
    public static final char FONTICON_RESIZE_HORIZONTAL = '\uE054';
    public static final char FONTICON_RESIZE_HORIZONTAL_2 = '\uE055';
    public static final char FONTICON_RESIZE_FULLSCREEN = '\uE056';
    public static final char FONTICON_RESIZE_FULL = '\uE057';
    public static final char FONTICON_REPEAT = '\uE058';
    public static final char FONTICON_REORDER = '\uE059';
    public static final char FONTICON_REMOVE = '\uE05A';
    public static final char FONTICON_REMOVE_SIGN = '\uE05B';
    public static final char FONTICON_REMOVE_CIRCLE = '\uE05C';
    public static final char FONTICON_READ_MORE = '\uE05D';
    public static final char FONTICON_RANDOM = '\uE05E';
    public static final char FONTICON_QUESTION_SIGN = '\uE05F';
    public static final char FONTICON_PUSHPIN = '\uE060';
    public static final char FONTICON_PUSHPIN_2 = '\uE061';
    public static final char FONTICON_PRINT = '\uE062';
    public static final char FONTICON_PLUS = '\uE063';
    public static final char FONTICON_PLUS_SIGN = '\uE064';
    public static final char FONTICON_PLAY = '\uE065';
    public static final char FONTICON_PICTURE = '\uE066';
    public static final char FONTICON_PHONE = '\uE067';
    public static final char FONTICON_PHONE_SIGN = '\uE068';
    public static final char FONTICON_PHONE_BOXED = '\uE069';
    public static final char FONTICON_PAUSE = '\uE06A';
    public static final char FONTICON_PASTE = '\uE06B';
    public static final char FONTICON_PAPER_CLIP = '\uE06C';
    public static final char FONTICON_OK = '\uE06D';
    public static final char FONTICON_OK_SIGN = '\uE06E';
    public static final char FONTICON_OK_CIRCLE = '\uE06F';
    public static final char FONTICON_MUSIC = '\uE070';
    public static final char FONTICON_MOVE = '\uE071';
    public static final char FONTICON_MONEY = '\uE072';
    public static final char FONTICON_MINUS = '\uE073';
    public static final char FONTICON_MINUS_SIGN = '\uE074';
    public static final char FONTICON_MAP = '\uE075';
    public static final char FONTICON_MAP_MARKER = '\uE076';
    public static final char FONTICON_MAP_MARKER_2 = '\uE077';
    public static final char FONTICON_MAGNET = '\uE078';
    public static final char FONTICON_MAGIC = '\uE079';
    public static final char FONTICON_LOCK = '\uE07A';
    public static final char FONTICON_LIST_3 = '\uE07C';
    public static final char FONTICON_LINK = '\uE07E';
    public static final char FONTICON_LAYER = '\uE07F';
    public static final char FONTICON_KEY = '\uE080';
    public static final char FONTICON_ITALIC = '\uE081';
    public static final char FONTICON_INFO = '\uE082';
    public static final char FONTICON_INDENT_RIGHT = '\uE083';
    public static final char FONTICON_INDENT_LEFT = '\uE084';
    public static final char FONTICON_INBOX = '\uE085';
    public static final char FONTICON_INBOX_EMPTY = '\uE086';
    public static final char FONTICON_HOME = '\uE087';
    public static final char FONTICON_HEART = '\uE088';
    public static final char FONTICON_HEART_LINE = '\uE089';
    public static final char FONTICON_HEADPHONES = '\uE08A';
    public static final char FONTICON_HEADPHONES_LINE = '\uE08B';
    public static final char FONTICON_HEADPHONES_LINE_2 = '\uE08C';
    public static final char FONTICON_HEADPHONES_2 = '\uE08D';
    public static final char FONTICON_HDD = '\uE08E';
    public static final char FONTICON_GROUP = '\uE08F';
    public static final char FONTICON_GRID = '\uE090';
    public static final char FONTICON_GRID_LARGE = '\uE091';
    public static final char FONTICON_GLOBE_LINE = '\uE092';
    public static final char FONTICON_GLASS = '\uE093';
    public static final char FONTICON_GLASS_2 = '\uE094';
    public static final char FONTICON_GIFT = '\uE095';
    public static final char FONTICON_FORWARD = '\uE096';
    public static final char FONTICON_FONT = '\uE097';
    public static final char FONTICON_FOLDER_OPEN = '\uE098';
    public static final char FONTICON_FOLDER_CLOSE = '\uE099';
    public static final char FONTICON_FLAG = '\uE09A';
    public static final char FONTICON_FIRE = '\uE09B';
    public static final char FONTICON_FILM = '\uE09C';
    public static final char FONTICON_FILE = '\uE09D';
    public static final char FONTICON_FILE_EMPTY = '\uE09E';
    public static final char FONTICON_FAST_FORWARD = '\uE09F';
    public static final char FONTICON_FAST_BACKWARD = '\uE0A0';
    public static final char FONTICON_FACETIME = '\uE0A1';
    public static final char FONTICON_EYE = '\uE0A2';
    public static final char FONTICON_EYE_DISABLE = '\uE0A3';
    public static final char FONTICON_EXPAND_VIEW = '\uE0A4';
    public static final char FONTICON_EXPAND_VIEW_3 = '\uE0A5';
    public static final char FONTICON_EXPAND_VIEW_2 = '\uE0A6';
    public static final char FONTICON_EXPAND_VERTICAL = '\uE0A7';
    public static final char FONTICON_EXPAND_HORIZONTAL = '\uE0A8';
    public static final char FONTICON_EXCLAMATION = '\uE0A9';
    public static final char FONTICON_EMAIL = '\uE0AA';
    public static final char FONTICON_EMAIL_2 = '\uE0AB';
    public static final char FONTICON_EJECT = '\uE0AC';
    public static final char FONTICON_EDIT = '\uE0AD';
    public static final char FONTICON_EDIT_CHECK = '\uE0AE';
    public static final char FONTICON_DOWNLOAD = '\uE0AF';
    public static final char FONTICON_DOWNLOAD_2 = '\uE0B0';
    public static final char FONTICON_DASHBOARD = '\uE0B1';
    public static final char FONTICON_CREDIT_CARD = '\uE0B2';
    public static final char FONTICON_COPY = '\uE0B3';
    public static final char FONTICON_COMMENTS = '\uE0B4';
    public static final char FONTICON_COMMENTS_LINE = '\uE0B5';
    public static final char FONTICON_COMMENT = '\uE0B6';
    public static final char FONTICON_COMMENT_LINE = '\uE0B7';
    public static final char FONTICON_COGS = '\uE0BA';
    public static final char FONTICON_COG = '\uE0BB';
    public static final char FONTICON_CLOUD = '\uE0BC';
    public static final char FONTICON_CHECK_1 = '\uE0BD';
    public static final char FONTICON_CHECK_EMPTY = '\uE0BE';
    public static final char FONTICON_CERTIFICATE = '\uE0BF';
    public static final char FONTICON_CAMERA = '\uE0C0';
    public static final char FONTICON_PLUS_2 = '\uE0C1';
    public static final char FONTICON_BULLHORN = '\uE0C2';
    public static final char FONTICON_BRIEFCASE = '\uE0C3';
    public static final char FONTICON_BOOKMARK = '\uE0C4';
    public static final char FONTICON_BOOK = '\uE0C5';
    public static final char FONTICON_BOLT = '\uE0C6';
    public static final char FONTICON_BOLD = '\uE0C7';
    public static final char FONTICON_BLOCKQUOTE = '\uE0C8';
    public static final char FONTICON_BELL = '\uE0C9';
    public static final char FONTICON_BEAKER = '\uE0CA';
    public static final char FONTICON_BARCODE = '\uE0CB';
    public static final char FONTICON_BAN_CIRCLE = '\uE0CC';
    public static final char FONTICON_BAN_CHART = '\uE0CD';
    public static final char FONTICON_BAN_CHART_2 = '\uE0CE';
    public static final char FONTICON_BACKWARD = '\uE0CF';
    public static final char FONTICON_ASTERISK = '\uE0D0';
    public static final char FONTICON_ARROW_SIMPLE_UP = '\uE0D1';
    public static final char FONTICON_ARROW_SIMPLE_UP_CIRCLE = '\uE0D2';
    public static final char FONTICON_ARROW_SIMPLE_RIGHT = '\uE0D3';
    public static final char FONTICON_ARROW_SIMPLE_RIGHT_CIRCLE = '\uE0D4';
    public static final char FONTICON_ARROW_SIMPLE_LEFT = '\uE0D5';
    public static final char FONTICON_ARROW_SIMPLE_LEFT_CIRCLE = '\uE0D6';
    public static final char FONTICON_ARROW_SIMPLE_DOWN = '\uE0D7';
    public static final char FONTICON_ARROW_SIMPLE_DOWN_CIRCLE = '\uE0D8';
    public static final char FONTICON_ARROW_ROUND_UP = '\uE0D9';
    public static final char FONTICON_ARROW_ROUND_UP_CIRCLE = '\uE0DA';
    public static final char FONTICON_ARROW_ROUND_RIGHT = '\uE0DB';
    public static final char FONTICON_ARROW_ROUND_RIGHT_CIRCLE = '\uE0DC';
    public static final char FONTICON_ARROW_ROUND_LEFT = '\uE0DD';
    public static final char FONTICON_ARROW_ROUND_LEFT_CIRCLE = '\uE0DE';
    public static final char FONTICON_ARROW_ROUND_DOWN = '\uE0DF';
    public static final char FONTICON_ARROW_ROUND_DOWN_CIRCLE = '\uE0E0';
    public static final char FONTICON_ARROW_LIGHT_UP = '\uE0E1';
    public static final char FONTICON_ARROW_LIGHT_ROUND_UP = '\uE0E2';
    public static final char FONTICON_ARROW_LIGHT_ROUND_UP_CIRCLE = '\uE0E3';
    public static final char FONTICON_ARROW_LIGHT_ROUND_RIGHT = '\uE0E4';
    public static final char FONTICON_ARROW_LIGHT_ROUND_RIGHT_CIRCLE = '\uE0E5';
    public static final char FONTICON_ARROW_LIGHT_ROUND_LEFT = '\uE0E6';
    public static final char FONTICON_ARROW_LIGHT_ROUND_LEFT_CIRCLE = '\uE0E7';
    public static final char FONTICON_ARROW_LIGHT_ROUND_DOWN = '\uE0E8';
    public static final char FONTICON_ARROW_LIGHT_ROUND_DOWN_CIRCLE = '\uE0E9';
    public static final char FONTICON_ARROW_LIGHT_RIGHT = '\uE0EA';
    public static final char FONTICON_ARROW_LIGHT_LEFT = '\uE0EB';
    public static final char FONTICON_ARROW_LIGHT_DOWN = '\uE0EC';
    public static final char FONTICON_ALIGN_RIGHT = '\uE0ED';
    public static final char FONTICON_ALIGN_LEFT = '\uE0EE';
    public static final char FONTICON_ALIGN_JUSTIFY = '\uE0EF';
    public static final char FONTICON_ALIGN_CENTER = '\uE0F0';
    public static final char FONTICON_ADJUST = '\uE0F1';
    public static final char FONTICON_USER_6 = '\uE113';
    public static final char FONTICON_STAR_HALF_1 = '\uE701';
    public static final char FONTICON_OK_CIRCLED2 = '\uE702';
    public static final char FONTICON_CANCEL_CIRCLED2 = '\uE703';
    public static final char FONTICON_HELP_CIRCLED = '\uE704';
    public static final char FONTICON_INFO_CIRCLED = '\uE705';
    public static final char FONTICON_EYE_1 = '\uE70A';
    public static final char FONTICON_EYE_OFF = '\uE70B';
    public static final char FONTICON_TAG_1 = '\uE70C';
    public static final char FONTICON_TAGS_1 = '\uE70D';
    public static final char FONTICON_CAMERA_ALT = '\uE70F';
    public static final char FONTICON_REPLY_1 = '\uE712';
    public static final char FONTICON_PRINT_1 = '\uE716';
    public static final char FONTICON_RETWEET_1 = '\uE717';
    public static final char FONTICON_COMMENT_1 = '\uE718';
    public static final char FONTICON_CHAT = '\uE720';
    public static final char FONTICON_LOCATION_1 = '\uE724';
    public static final char FONTICON_LOCATION_INV = '\uE725';
    public static final char FONTICON_DOWN_OPEN = '\uE75C';
    public static final char FONTICON_LEFT_OPEN = '\uE75D';
    public static final char FONTICON_RIGHT_OPEN = '\uE75E';
    public static final char FONTICON_UP_OPEN = '\uE75F';
    public static final char FONTICON_DOWN_OPEN_MINI = '\uE760';
    public static final char FONTICON_LEFT_OPEN_MINI = '\uE761';
    public static final char FONTICON_RIGHT_OPEN_MINI = '\uE762';
    public static final char FONTICON_UP_OPEN_MINI = '\uE763';
    public static final char FONTICON_DOWN_OPEN_BIG = '\uE764';
    public static final char FONTICON_LEFT_OPEN_BIG = '\uE765';
    public static final char FONTICON_RIGHT_OPEN_BIG = '\uE766';
    public static final char FONTICON_UP_OPEN_BIG = '\uE767';
    public static final char FONTICON_DOT_2 = '\uE78C';
    public static final char FONTICON_DOT_3 = '\uE78D';
    public static final char FONTICON_EQUALIZER = '\uE795';
    public static final char FONTICON_PAPER_PLANE_1 = '\uE79B';
    public static final char FONTICON_DOWN_MICRO = '\uE7A7';
    public static final char FONTICON_UP_MICRO = '\uE7A8';
    public static final char FONTICON_BELL_2 = '\uE800';
    public static final char FONTICON_HOME_2 = '\uE801';
    public static final char FONTICON_HOME_3 = '\uE802';
    public static final char FONTICON_TAG_2 = '\uE803';
    public static final char FONTICON_HEART_4 = '\uE804';
    public static final char FONTICON_HEART_EMPTY_1 = '\uE805';
    public static final char FONTICON_LOCATION_2 = '\uE806';
    public static final char FONTICON_COMPASS = '\uE807';
    public static final char FONTICON_TAGS_2 = '\uE808';
    public static final char FONTICON_TAG_3 = '\uE809';
    public static final char FONTICON_POST = '\uE80A';
    public static final char FONTICON_STAR_3 = '\uE80B';
    public static final char FONTICON_HOME_4 = '\uE80C';
    public static final char FONTICON_HOME_5 = '\uE80D';
    public static final char FONTICON_HOME_OUTLINE = '\uE80E';
    public static final char FONTICON_USERS_2 = '\uE80F';
    public static final char FONTICON_USERS_OUTLINE = '\uE810';
    public static final char FONTICON_DOWN_OPEN_2 = '\uE811';
    public static final char FONTICON_LEFT_OPEN_2 = '\uE812';
    public static final char FONTICON_RIGHT_OPEN_2 = '\uE813';
    public static final char FONTICON_DOWN_DIR_1 = '\uE814';
    public static final char FONTICON_LEFT_DIR_1 = '\uE815';
    public static final char FONTICON_RIGHT_DIR_1 = '\uE816';
    public static final char FONTICON_UP_DIR_1 = '\uE817';
    public static final char FONTICON_PLAY_2 = '\uE818';
    public static final char FONTICON_HEART_FILLED = '\uE819';
    public static final char FONTICON_STAR_2 = '\uE81A';
    public static final char FONTICON_STAR_FILLED = '\uE81B';
    public static final char FONTICON_CAMERA_OUTLINE = '\uE81C';
    public static final char FONTICON_CAMERA_2 = '\uE81D';
    public static final char FONTICON_MIC_OUTLINE = '\uE81E';
    public static final char FONTICON_LOCATION = '\uE81F';
    public static final char FONTICON_UP_OPEN_2 = '\uE820';
    public static final char FONTICON_HEART_2 = '\uE821';
    public static final char FONTICON_SEARCH_2 = '\uE822';
    public static final char FONTICON_USER_2 = '\uE823';
    public static final char FONTICON_HEART_3 = '\uE824';
    public static final char FONTICON_MAIL_2 = '\uE825';
    public static final char FONTICON_USER_4 = '\uE826';
    public static final char FONTICON_LOCK_OPEN_1 = '\uE827';
    public static final char FONTICON_LOCK_2 = '\uE828';
    public static final char FONTICON_OK_CIRCLE_1 = '\uE829';
    public static final char FONTICON_CANCEL_CIRCLE = '\uE82A';
    public static final char FONTICON_PLUS_CIRCLE = '\uE82B';
    public static final char FONTICON_MINUS_CIRCLE = '\uE82C';
    public static final char FONTICON_EYE_2 = '\uE82D';
    public static final char FONTICON_EYE_OUTLINE = '\uE82E';
    public static final char FONTICON_CANCEL_CIRCLED_1 = '\uE82F';
    public static final char FONTICON_SPIN1 = '\uE830';
    public static final char FONTICON_SPIN2 = '\uE831';
    public static final char FONTICON_SPIN3 = '\uE832';
    public static final char FONTICON_INFO_CIRCLED_2 = '\uE833';
    public static final char FONTICON_SPIN4 = '\uE834';
    public static final char FONTICON_INFO_3 = '\uE835';
    public static final char FONTICON_CAMERA_3 = '\uE836';
    public static final char FONTICON_MAIL_3 = '\uE837';
    public static final char FONTICON_SPIN5 = '\uE838';
    public static final char FONTICON_SPIN6 = '\uE839';
    public static final char FONTICON_USERS_3 = '\uE83A';
    public static final char FONTICON_PHONE_2 = '\uE83B';
    public static final char FONTICON_SEARCH_4 = '\uE83C';
    public static final char FONTICON_SEARCH_5 = '\uE83D';
    public static final char FONTICON_DOWN_DIR_2 = '\uE83E';
    public static final char FONTICON_DOWN_DIR_3 = '\uE83F';
    public static final char FONTICON_UP_DIR_2 = '\uE840';
    public static final char FONTICON_PAPER_PLANE_2 = '\uE841';
    public static final char FONTICON_SHARE = '\uE842';
    public static final char FONTICON_DELETE = '\uE843';
    public static final char FONTICON_ADD = '\uE844';
    public static final char FONTICON_CROWN_PLUS = '\uE845';
    public static final char FONTICON_FORWARD_2 = '\uE846';
    public static final char FONTICON_MARQUEE = '\uE847';
    public static final char FONTICON_MINUS_2 = '\uE848';
    public static final char FONTICON_REPLY_2 = '\uE849';
    public static final char FONTICON_CLOSE_2 = '\uE84A';
    public static final char FONTICON_CLOSE = '\uE84B';
    public static final char FONTICON_STOP_2 = '\uE84C';
    public static final char FONTICON_PLACHOLDER = '\uE84D';
    public static final char FONTICON_OK_2 = '\uE84E';
    public static final char FONTICON_MAIL_CIRCLED = '\uE84F';
    public static final char FONTICON_ANNOUNCEMENT_ICON = '\uE91D';
    public static final char FONTICON_PEN_ICON = '\uE91E';
    public static final char FONTICON_SIDE_MENU = '\uE91F';
    public static final char FONTICON_NOTIFICATION_ICON = '\uE920';
    public static final char FONTICON_LIST_ICON = '\uE921';
    public static final char FONTICON_FORUM_ICON = '\uE922';
    public static final char FONTICON_CHAT_ICON = '\uE923';
    public static final char FONTICON_SHOW = '\uE924';
    public static final char FONTICON_KEYHOLE = '\uE927';
    public static final char FONTICON_PLACEHOLDER = '\uE928';
    public static final char FONTICON_USER_7 = '\uE929';
    public static final char FONTICON_CHECK_2 = '\uEA48';
    public static final char FONTICON_CHECK_3 = '\uEA49';
    public static final char FONTICON_CHECK_4 = '\uEA4A';
    public static final char FONTICON_DOWN_OPEN_1 = '\uF004';
    public static final char FONTICON_UP_OPEN_1 = '\uF005';
    public static final char FONTICON_RIGHT_OPEN_1 = '\uF006';
    public static final char FONTICON_LEFT_OPEN_1 = '\uF007';
    public static final char FONTICON_USER_3 = '\uF061';
    public static final char FONTICON_USER_MALE = '\uF062';
    public static final char FONTICON_USER_FEMALE = '\uF063';
    public static final char FONTICON_USERS_1 = '\uF064';
    public static final char FONTICON_LINK_EXT = '\uF08E';
    public static final char FONTICON_CHECK_EMPTY_1 = '\uF096';
    public static final char FONTICON_BOOKMARK_EMPTY = '\uF097';
    public static final char FONTICON_MENU = '\uF0C9';
    public static final char FONTICON_MAIL_ALT = '\uF0E0';
    public static final char FONTICON_COMMENT_EMPTY = '\uF0E5';
    public static final char FONTICON_CHAT_EMPTY = '\uF0E6';
    public static final char FONTICON_DOWNLOAD_CLOUD = '\uF0ED';
    public static final char FONTICON_UPLOAD_CLOUD = '\uF0EE';
    public static final char FONTICON_BELL_ALT = '\uF0F3';
    public static final char FONTICON_PLUS_SQUARED = '\uF0FE';
    public static final char FONTICON_ANGLE_LEFT = '\uF104';
    public static final char FONTICON_ANGLE_RIGHT = '\uF105';
    public static final char FONTICON_ANGLE_UP = '\uF106';
    public static final char FONTICON_ANGLE_DOWN = '\uF107';
    public static final char FONTICON_QUOTE_LEFT = '\uF10D';
    public static final char FONTICON_QUOTE_RIGHT = '\uF10E';
    public static final char FONTICON_SPINNER = '\uF110';
    public static final char FONTICON_REPLY = '\uF112';
    public static final char FONTICON_GAMEPAD = '\uF11B';
    public static final char FONTICON_KEYBOARD = '\uF11C';
    public static final char FONTICON_FLAG_EMPTY = '\uF11D';
    public static final char FONTICON_FLAG_CHECKERED = '\uF11E';
    public static final char FONTICON_CODE = '\uF121';
    public static final char FONTICON_REPLY_ALL = '\uF122';
    public static final char FONTICON_STAR_HALF_ALT = '\uF123';
    public static final char FONTICON_UNLINK = '\uF127';
    public static final char FONTICON_HELP = '\uF128';
    public static final char FONTICON_INFO_1 = '\uF129';
    public static final char FONTICON_ATTENTION_ALT = '\uF12A';
    public static final char FONTICON_LOCK_OPEN_ALT = '\uF13E';
    public static final char FONTICON_ELLIPSIS = '\uF141';
    public static final char FONTICON_ELLIPSIS_VERT = '\uF142';
    public static final char FONTICON_MINUS_SQUARED = '\uF146';
    public static final char FONTICON_MINUS_SQUARED_ALT = '\uF147';
    public static final char FONTICON_OK_SQUARED = '\uF14A';
    public static final char FONTICON_PENCIL_SQUARED = '\uF14B';
    public static final char FONTICON_LINK_EXT_ALT = '\uF14C';
    public static final char FONTICON_THUMBS_UP_ALT = '\uF164';
    public static final char FONTICON_THUMBS_DOWN_ALT = '\uF165';
    public static final char FONTICON_FEMALE = '\uF182';
    public static final char FONTICON_MALE = '\uF183';
    public static final char FONTICON_DOT_CIRCLED = '\uF192';
    public static final char FONTICON_PLUS_SQUARED_ALT = '\uF196';
    public static final char FONTICON_MAIL_SQUARED = '\uF199';
    public static final char FONTICON_CHILD = '\uF1AE';
    public static final char FONTICON_CIRCLE_NOTCH = '\uF1CE';
    public static final char FONTICON_PAPER_PLANE = '\uF1D8';
    public static final char FONTICON_PAPER_PLANE_EMPTY = '\uF1D9';
    public static final char FONTICON_CIRCLE_THIN = '\uF1DB';
    public static final char FONTICON_SHARE_SQUARED = '\uF1E1';
    public static final char FONTICON_BELL_OFF = '\uF1F6';
    public static final char FONTICON_BELL_OFF_EMPTY = '\uF1F7';
    public static final char FONTICON_TOGGLE_OFF = '\uF204';
    public static final char FONTICON_TOGGLE_ON = '\uF205';
    public static final char FONTICON_USER_SECRET = '\uF21B';
    public static final char FONTICON_SOCIAL_WHATSAPP = '\uF232';
    public static final char FONTICON_USER_PLUS = '\uF234';
    public static final char FONTICON_USER_TIMES = '\uF235';
    public static final char FONTICON_PICTURE_1 = '\uF304';
    public static final char FONTICON_VIMEO_CIRCLED = '\uF307';
    public static final char FONTICON_TWITTER = '\uF309';
    public static final char FONTICON_TWITTER_CIRCLED = '\uF30A';
    public static final char FONTICON_FACEBOOK = '\uF30C';
    public static final char FONTICON_FACEBOOK_CIRCLED = '\uF30D';
    public static final char FONTICON_GPLUS = '\uF30F';
    public static final char FONTICON_GPLUS_CIRCLED = '\uF310';
    public static final char FONTICON_PINTEREST = '\uF312';
    public static final char FONTICON_PINTEREST_CIRCLED = '\uF313';
    public static final char FONTICON_TUMBLR = '\uF315';
    public static final char FONTICON_TUMBLR_CIRCLED = '\uF316';
    public static final char FONTICON_LINKEDIN_CIRCLED = '\uF319';
    public static final char FONTICON_SOCIAL_INSTAGRAM_1 = '\uF31E';
    public static final char FONTICON_SOCIAL_INSTAGRAM = '\uF32D';
    public static final char FONTICON_GLASS_1 = '\uF378';
    public static final char FONTICON_MIC = '\uF3A4';
    public static final char FONTICON_VIDEOCAM = '\uF3A5';
    public static final char FONTICON_VIDEO = '\uF3AC';
    public static final char FONTICON_THUMBS_UP = '\uF44D';
    public static final char FONTICON_THUMBS_DOWN = '\uF44E';
    public static final char FONTICON_USER_1 = '\uF464';
    public static final char FONTICON_USERS = '\uF465';
    public static final char FONTICON_USER_WOMAN = '\uF469';
    public static final char FONTICON_USER_PAIR = '\uF46B';
    public static final char FONTICON_PIN = '\uF4CC';
    public static final char FONTICON_ATTACH = '\uF4CE';
    public static final char FONTICON_PHONE_1 = '\uF4DE';
    public static final char FONTICON_MEGAPHONE = '\uF4E3';
    public static final char FONTICON_DOWNLOAD_1 = '\uF4E5';
    public static final char FONTICON_MOBILE = '\uF4F1';
    public static final char FONTICON_CAMERA_1 = '\uF4F7';
    public static final char FONTICON_SEARCH_1 = '\uF500';
    public static final char FONTICON_SEARCH_3 = '\uF50D';
    public static final char FONTICON_KEY_INV = '\uF511';
    public static final char FONTICON_LOCK_1 = '\uF512';
    public static final char FONTICON_LOCK_OPEN = '\uF513';
    public static final char FONTICON_BELL_1 = '\uF514';
    public static final char FONTICON_BOOKMARK_1 = '\uF516';
    public static final char FONTICON_LINK_1 = '\uF517';
    public static final char FONTICON_USER_5 = '\uF466';
    public static final char FONTICON_UPLOAD_1 = '\uF4E4';

    /**
     * FloatingButton.BOTTOM_RIGHT displays the button at the bottom right
     * corner
     */
    public static final int BOTTOM_RIGHT = 1;

    /**
     * FloatingButton.BOTTOM_RIGHT displays the button at the bottom left corner
     */
    public static final int BOTTOM_LEFT = 2;

    /**
     * FloatingButton.BOTTOM_RIGHT displays the button at the bottom center
     */
    public static final int BOTTOM_CENTER = 3;

    /**
     * Size of the floating button icon, default to 4
     */
    private int size = 4;

    /**
     * Color of the floating button icon, default to 0xffffff
     */
    private int color = 0xffffff;

    /**
     * Position where the floating button should be displayed
     */
    private int position = BOTTOM_RIGHT;

    /**
     * Construct a floating button with pen icon and without multi commands
     *
     * @param defaultCommand the default action the floating button should
     * perform
     */
    public FloatingButton(Command defaultCommand) {
        this(defaultCommand, FloatingButton.FONTICON_PENCIL, null);
    }

    /**
     * Construct a floating button with the specified icon
     *
     * @param defaultCommand the default action the floating button should
     * perform
     * @param icon the floating button icon character code, e.g. '\u270E',
     * defaults to FloatingButton.FONTICON_PENCIL
     */
    public FloatingButton(Command defaultCommand, Character icon) {
        this(defaultCommand, icon, null);
    }

    /**
     * Construct a floating button with the specified icon and multi commands
     *
     * @param defaultCommand the default action the floating button should
     * perform
     * @param icon the floating button icon character code, e.g. '\u270E',
     * defaults to FloatingButton.FONTICON_PENCIL
     * @param floatingCommands optional commands to be shown when floating
     * button is pressed
     */
    public FloatingButton(Command defaultCommand, Character icon, Map<Command, Character> floatingCommands) {
        setUIID("FloatingButton");
        getAllStyles().setAlignment(CENTER);
        setIcon(createFontIcon(icon, size, color));
        drawButton();
        if (defaultCommand == null) {
            throw new IllegalArgumentException("Default command is null");
        }
        if (floatingCommands != null) {
            if (floatingCommands.size() < 1) {
                this.addActionListener(defaultCommand);
            } else {
                this.addActionListener((evt) -> {
                    showFloatingCommands(floatingCommands);
                });
            }
        } else {
            this.addActionListener(defaultCommand);
        }
    }

    /**
     *
     * @return the size of the floating button
     */
    public int getSize() {
        return size;
    }

    /**
     * Set the size of the floating button icon
     *
     * @param size the size of the floating button icon, default to 4
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     *
     * @return the color of the floating button icon
     */
    public int getColor() {
        return color;
    }

    /**
     * Set the color the floating button icon
     *
     * @param color the color of the floating button icon
     */
    public void setColor(int color) {
        this.color = color;
    }

    /**
     *
     * @return the position of the floating button
     */
    public int getPosition() {
        return position;
    }

    /**
     * Set the position where the floating button should be placed
     *
     * @param position One of BOTTOM_RIGHT, BOTTOM_LEFT, BOTTOM_CENTER
     */
    public void setPosition(int position) {
        this.position = position;
    }

    /**
     * Draw the button using the background color and transparency of
     * "FloatingButton" uiid
     *
     */
    protected void drawButton() {
        BackgroundPainter p = new BackgroundPainter(this) {

            @Override
            public void paint(Graphics g, Rectangle rect) {
                boolean antiAliased = g.isAntiAliased();
                g.setAntiAliased(true);
                int r = Math.min(rect.getWidth(), rect.getHeight()) / 2;
                int x = rect.getX() + rect.getWidth() / 2 - r;
                int y = rect.getY() + rect.getHeight() / 2 - r;
                int alpha = getStyle().getBgTransparency();
                if (alpha < 0) {
                    alpha = 0xff;
                }
                g.drawImage(getImageFromString("floating_shadow.png"), x - 2, y - 2, 2 * r + 4, 2 * r + 4);
                g.setAlpha(alpha);
                g.setColor(getStyle().getBgColor());
                g.fillArc(x, y, 2 * r - 4, 2 * r - 4, 0, 360);
                //g.setAlpha(0xff);
                g.setAntiAliased(antiAliased);
            }
        };
        int pad = Math.round(size * 2 / 3);
        int pad2 = Math.round(size * 4 / 5);
        getAllStyles().setBgPainter(p);
        getAllStyles().setPadding(pad, pad2, pad, pad2);
    }

    //Considering using Google material icons, but icons here are limited and can't be expanded.
    /*private Image createMaterialIcon(Character icon) {
    Style style = new Style(getAllStyles().getBgColor(), getAllStyles().getFgColor(), getAllStyles().getFont(), (byte) 0);
    Image image = FontImage.createMaterial(icon, style);
    System.out.println(image);
    if (image != null) {
    return image;
    }
    return null;
    }*/
    /**
     * Convert specified size based on device screen
     *
     * @param size the size of the floating button icon, default to 4
     */
    private int Size(int size) {
        return Display.getInstance().convertToPixels(size, false);
    }

    /**
     * Create a font icon from specified character code, size, and color
     *
     * @param charCode the character code to create the icon from, e.g. '\u270E'
     * @param size the size of the icon
     * @param color the color of the icon, defaults to 0xffffff
     */
    private FontImage createFontIcon(Character charCode, int size, int color) {
        Font fnt = Font.createTrueTypeFont("fonticon", "fonticon.ttf");
        FontImage fm = FontImage.createFixed("" + charCode, fnt, color, Size(size), Size(size));
        fm.setPadding(0);
        return fm;
    }

    /**
     * Show twitter android style floating commands, animation needs a lot of
     * work
     *
     * @param floatingCommands the commands to be shown when floating button is
     * pressed
     */
    private void showFloatingCommands(Map<Command, Character> floatingCommands) {
        Container commandsCont = new Container(new BoxLayout(BoxLayout.Y_AXIS));
        for (Map.Entry<Command, Character> entry : floatingCommands.entrySet()) {
            Button btn = new Button(entry.getKey().getCommandName());
            btn.addActionListener(entry.getKey());
            btn.setUIID("FloatCommand");

            Button btnIcon = new Button(createFontIcon(entry.getValue(), size - 1, 0xffffff));
            btnIcon.addActionListener(entry.getKey());
            btnIcon.setUIID("FloatButton");

            BackgroundPainter p = new BackgroundPainter(btnIcon) {
                @Override
                public void paint(Graphics g, Rectangle rect) {
                    boolean antiAliased = g.isAntiAliased();
                    g.setAntiAliased(true);
                    int r = Math.min(rect.getWidth(), rect.getHeight()) / 2;
                    int x = rect.getX() + rect.getWidth() / 2 - r;
                    int y = rect.getY() + rect.getHeight() / 2 - r;
                    int alpha = getStyle().getBgTransparency();
                    if (alpha < 0) {
                        alpha = 0xff;
                    }
                    g.drawImage(getImageFromString("floating_shadow.png"), x - 2, y - 2, 2 * r + 4, 2 * r + 4);
                    g.setAlpha(alpha);
                    g.setColor(getStyle().getBgColor());
                    g.fillArc(x, y, 2 * r - 4, 2 * r - 4, 0, 360);
                    //g.setAlpha(0xff);
                    g.setAntiAliased(antiAliased);
                }
            };

            int pad = Math.round((size - 1) * 2 / 3);
            int pad2 = Math.round((size - 1) * 4 / 5);
            btnIcon.getAllStyles().setBgPainter(p);
            btnIcon.getAllStyles().setPadding(pad, pad2, pad, pad2);

            Container bl = new Container(new BorderLayout(BorderLayout.CENTER_BEHAVIOR_CENTER_ABSOLUTE));
            commandsCont.add(FlowLayout.encloseRightBottom(bl.add(BorderLayout.CENTER, btn)));

            switch (position) {
                case BOTTOM_LEFT:
                    bl.add(BorderLayout.WEST, btnIcon);
                    break;
                case BOTTOM_CENTER:
                    bl.add(BorderLayout.WEST, btnIcon);
                    break;
                default:
                    bl.add(BorderLayout.EAST, btnIcon);
                    break;
            }
        }
        Dialog dlg = new Dialog();
        dlg.setDialogUIID("Container");
        switch (position) {
            case BOTTOM_LEFT:
                dlg.setTransitionInAnimator(CommonTransitions.createSlide(CommonTransitions.SLIDE_HORIZONTAL, false, 100, false));
                dlg.setTransitionOutAnimator(CommonTransitions.createSlide(CommonTransitions.SLIDE_HORIZONTAL, true, 100, false));
                break;
            case BOTTOM_CENTER:
                dlg.setTransitionInAnimator(CommonTransitions.createSlide(CommonTransitions.SLIDE_VERTICAL, true, 100, false));
                dlg.setTransitionOutAnimator(CommonTransitions.createSlide(CommonTransitions.SLIDE_VERTICAL, false, 100, false));
                break;
            default:
                dlg.setTransitionInAnimator(CommonTransitions.createSlide(CommonTransitions.SLIDE_HORIZONTAL, true, 100, false));
                dlg.setTransitionOutAnimator(CommonTransitions.createSlide(CommonTransitions.SLIDE_HORIZONTAL, false, 100, false));
                break;
        }
        dlg.add(commandsCont);

        int marginLeft = getStyle().getMarginValue(true, Component.LEFT);
        int marginRight = getStyle().getMarginValue(true, Component.RIGHT);
        commandsCont.getStyle().setPaddingUnit(this.getStyle().getMarginUnit());
        commandsCont.getStyle().setPadding(0, 0, marginLeft, marginRight);

        dlg.showPopupDialog(this);
    }

    /**
     * Add floating button to specified position
     *
     * @param f the form to add the floating button to
     * @param position the position where the floating button should be placed.
     * One of FloatingButton.BOTTOM_RIGHT, FloatingButton.BOTTOM_LEFT,
     * FloatingButton.BOTTOM_CENTER
     */
    public void addToForm(Form f, int position) {
        if (!(f instanceof Form)) {
            throw new IllegalArgumentException("FloatingButton can only be added to a form");
        }

        Container cnt = f.getLayeredPane();
        if (cnt.getComponentCount() > 0) {
            throw new IllegalArgumentException("Form already has a component in its layered pane");
        }

        int marginBottom = getStyle().getMarginValue(true, Component.BOTTOM);
        cnt.setLayout(new LayeredLayout());
        cnt.getStyle().setPaddingUnit(this.getStyle().getMarginUnit());
        cnt.getStyle().setPadding(Component.BOTTOM, marginBottom);

        setPosition(position);
        switch (this.position) {
            case BOTTOM_LEFT:
                cnt.add(FlowLayout.encloseBottom(this));
                break;
            case BOTTOM_CENTER:
                cnt.add(FlowLayout.encloseCenterBottom(this));
                break;
            default:
                cnt.add(FlowLayout.encloseRightBottom(this));
                break;
        }
    }

    /**
     * Add floating button to default bottom right position
     *
     * @param f the form to add the floating button to
     */
    public void addToForm(Form f) {
        this.addToForm(f, position);
    }

    /**
     * Get an Image from the "src" folder
     *
     * @param name the name of the image
     * @return an image if exist or null
     */
    private Image getImageFromString(String name) {
        try {
            return Image.createImage(Display.getInstance().getResourceAsStream(getClass(), "/" + name));
        } catch (IOException ioe) {
        }
        return null;
    }
}
