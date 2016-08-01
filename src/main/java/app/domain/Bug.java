package app.domain;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Bug implements Serializable {
	private Long question_id;
	private Long game_id;
	private int question_type;
	private Long player_id;
	private Long redemption_time;
	private String redemption_source;
	private int refund_type;
	private String business_order_no;
	private String server_name;
	private String role_name;
	private Double recharge_money;
	private Long issus_time;
	private String tele;
	private String content;
	private String source;
	private int vip_level;
	private String reply_content;
	private int service_raing;
	private int satisfaction_rating;
	private int service_rating;
	private Long submit_time;
	private Long reply_time;
	private Long handle_time;
	private Long rating_time;
	private int status;
}
