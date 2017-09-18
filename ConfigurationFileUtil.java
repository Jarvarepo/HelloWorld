
public class ConfigurationFileUtil {
	// TODO Auto-generated method stub
	final String VNFM_NAME_REPLACEMENT = "<!-- %s -->";
	final String VNFM_NAME_REGEX = "(^<!-- ([\\w,_]+) \\-\\->.*)";
	final String NODE_INFO_XML_FILE_NAME = "nodeInfo.xml";
	final String PROJECT_INFO_XML_FILE_NAME = "projectInfo.xml";
	final String MATCHER_FILE_NAME = "fname";
	final String VN_DESCRIPTOR_REGEX = "<virtualNetworkDescriptor>(?<fname>.*)</virtualNetworkDescriptor>";
	final String SITE_BASIC_REGEX = "<siteBasic>(?<fname>.*)</siteBasic>";
	final String GSDS_ADDRESS_STRUCT_REGEX = "(?s)(?<cbhost>.*<gsdsAddress struct=\"HostAndPort\">.*<host>)(?<host>.*)(?<cahost></host>.*<port>8301</port>.*)";
	final String MATCHER_CONTENT_BEFORE_HOST = "cbhost";
	final String MATCHER_CONTENT_AFTER_HOST = "cahost";

	public static void main(String[] args) {
		
	}

}
