package xavierdpt.jeefiddle.s7;

import java.io.IOException;
import java.security.KeyStore;

import javax.management.MBeanServer;
import javax.management.ObjectName;

import org.apache.catalina.LifecycleListener;
import org.apache.catalina.Service;
import org.apache.catalina.connector.Connector;
import org.apache.coyote.UpgradeProtocol;
import org.apache.tomcat.util.net.SSLHostConfig;
import org.apache.tomcat.util.net.SSLHostConfig.Type;
import org.apache.tomcat.util.net.SSLHostConfigCertificate;
import org.apache.tomcat.util.net.openssl.OpenSSLConf;
import org.junit.Test;

public class Fiddle00 {

	private static final Boolean B = null;
	private String string;
	private Object object;
	private Service service;
	private boolean b;
	private int i;
	private SSLHostConfig sslHostConfig;
	private UpgradeProtocol upgradeProtocol;
	private MBeanServer mBeanServer;
	private ObjectName pbjectName;
	private LifecycleListener lifecycleListener;
	private long l;
	private Long L;
	private Type type;
	private String[] strings;
	private ObjectName objectName;
	private SSLHostConfigCertificate sslHostConfigCertificate;
	private OpenSSLConf openSSLConf;
	private KeyStore keyStore;

	@Test
	public void fiddle() throws Exception {
		Connector c = getConnector();
		foo(c);
		bar(sslHostConfig);
	}

	private void bar(SSLHostConfig sslHostConfig) throws IOException {
		sslHostConfig.getOpenSslConfContext();
		sslHostConfig.setOpenSslConfContext(L);
		sslHostConfig.getOpenSslContext();
		sslHostConfig.setOpenSslContext(L);
		sslHostConfig.getConfigType();
		sslHostConfig.setConfigType(type);
		sslHostConfig.getEnabledProtocols();
		sslHostConfig.setEnabledProtocols(strings);
		sslHostConfig.getEnabledCiphers();
		sslHostConfig.setEnabledCiphers(strings);
		sslHostConfig.getObjectName();
		sslHostConfig.setObjectName(objectName);
		sslHostConfig.addCertificate(sslHostConfigCertificate);
		sslHostConfig.getOpenSslConf();
		sslHostConfig.setOpenSslConf(openSSLConf);
		sslHostConfig.getCertificates();
		sslHostConfig.getCertificates(b);
		sslHostConfig.getCertificateKeyPassword();
		sslHostConfig.setCertificateKeyPassword(string);
		sslHostConfig.setCertificateRevocationListFile(string);
		sslHostConfig.getCertificateRevocationListFile();
		sslHostConfig.setCertificateVerification(string);
		sslHostConfig.getCertificateVerification();
		sslHostConfig.setCertificateVerificationDepth(i);
		sslHostConfig.getCertificateVerificationDepth();
		sslHostConfig.isCertificateVerificationDepthConfigured();
		sslHostConfig.setCiphers(string);
		sslHostConfig.getCiphers();
		sslHostConfig.getCipherList();
		sslHostConfig.getJsseCipherNames();
		sslHostConfig.setHonorCipherOrder(string);
		sslHostConfig.getHonorCipherOrder();
		sslHostConfig.setHostName(string);
		sslHostConfig.getHostName();
		sslHostConfig.setProtocols(string);
		sslHostConfig.getProtocols();
		sslHostConfig.getCertificateKeyAlias();
		sslHostConfig.setCertificateKeyAlias(string);
		sslHostConfig.getCertificateKeystoreFile();
		sslHostConfig.setCertificateKeystoreFile(string);
		sslHostConfig.getCertificateKeystorePassword();
		sslHostConfig.setCertificateKeystorePassword(string);
		sslHostConfig.getCertificateKeystoreProvider();
		sslHostConfig.setCertificateKeystoreProvider(string);
		sslHostConfig.getCertificateKeystoreType();
		sslHostConfig.setCertificateKeystoreType(string);
		sslHostConfig.setKeyManagerAlgorithm(string);
		sslHostConfig.getKeyManagerAlgorithm();
		sslHostConfig.setRevocationEnabled(b);
		sslHostConfig.getRevocationEnabled();
		sslHostConfig.setSessionCacheSize(i);
		sslHostConfig.getSessionCacheSize();
		sslHostConfig.setSessionTimeout(i);
		sslHostConfig.getSessionTimeout();
		sslHostConfig.setSslProtocol(string);
		sslHostConfig.getSslProtocol();
		sslHostConfig.setTrustManagerClassName(string);
		sslHostConfig.getTrustManagerClassName();
		sslHostConfig.setTruststoreAlgorithm(string);
		sslHostConfig.getTruststoreAlgorithm();
		sslHostConfig.setTruststoreFile(string);
		sslHostConfig.getTruststoreFile();
		sslHostConfig.setTruststorePassword(string);
		sslHostConfig.getTruststorePassword();
		sslHostConfig.setTruststoreProvider(string);
		sslHostConfig.getTruststoreProvider();
		sslHostConfig.setTruststoreType(string);
		sslHostConfig.getTruststoreType();
		sslHostConfig.setTrustStore(keyStore);
		sslHostConfig.getTruststore();
		sslHostConfig.getCertificateChainFile();
		sslHostConfig.setCertificateChainFile(string);
		sslHostConfig.getCertificateFile();
		sslHostConfig.setCertificateFile(string);
		sslHostConfig.getCertificateKeyFile();
		sslHostConfig.setCertificateKeyFile(string);
		sslHostConfig.setCertificateRevocationListPath(string);
		sslHostConfig.getCertificateRevocationListPath();
		sslHostConfig.setCaCertificateFile(string);
		sslHostConfig.getCaCertificateFile();
		sslHostConfig.setCaCertificatePath(string);
		sslHostConfig.getCaCertificatePath();
		sslHostConfig.setDisableCompression(b);
		sslHostConfig.getDisableCompression();
		sslHostConfig.setDisableSessionTickets(b);
		sslHostConfig.getDisableSessionTickets();
		sslHostConfig.setInsecureRenegotiation(b);
		sslHostConfig.getInsecureRenegotiation();
	}

	@SuppressWarnings("deprecation")
	private void foo(Connector connector) throws Exception {

		connector.getProperty(string);
		connector.setProperty(string, string);
		connector.getAttribute(string);
		connector.setAttribute(string, object);
		connector.getService();
		connector.setService(service);
		connector.getAllowTrace();
		connector.setAllowTrace(b);
		connector.getAsyncTimeout();
		connector.setAsyncTimeout(l);
		connector.getEnableLookups();
		connector.setEnableLookups(b);
		connector.getMaxCookieCount();
		connector.setMaxCookieCount(i);
		connector.getMaxParameterCount();
		connector.setMaxParameterCount(i);
		connector.getMaxPostSize();
		connector.setMaxPostSize(i);
		connector.getMaxSavePostSize();
		connector.setMaxSavePostSize(i);
		connector.getParseBodyMethods();
		connector.setParseBodyMethods(string);
		connector.getPort();
		connector.setPort(i);
		connector.getLocalPort();
		connector.getProtocol();
		connector.setProtocol(string);
		connector.getProtocolHandlerClassName();
		connector.setProtocolHandlerClassName(string);
		connector.getProtocolHandler();
		connector.getProxyName();
		connector.setProxyName(string);
		connector.getProxyPort();
		connector.setProxyPort(i);
		connector.getRedirectPort();
		connector.setRedirectPort(i);
		connector.getScheme();
		connector.setScheme(string);
		connector.getSecure();
		connector.setSecure(b);
		connector.getURIEncoding();
		connector.getURIEncodingLower();
		connector.getURICharset();
		connector.setURIEncoding(string);
		connector.getUseBodyEncodingForURI();
		connector.setUseBodyEncodingForURI(b);
		connector.getXpoweredBy();
		connector.setXpoweredBy(b);
		connector.setUseIPVHosts(b);
		connector.getUseIPVHosts();
		connector.getExecutorName();
		connector.addSslHostConfig(sslHostConfig);
		connector.findSslHostConfigs();
		connector.addUpgradeProtocol(upgradeProtocol);
		connector.findUpgradeProtocols();
		connector.createRequest();
		connector.createResponse();
		connector.pause();
		connector.resume();
		connector.toString();
		connector.setDomain(string);
		connector.getDomain();
		connector.getObjectName();
		connector.postDeregister();
		connector.postRegister(B);
		connector.preDeregister();
		connector.preRegister(mBeanServer, pbjectName);
		connector.addLifecycleListener(lifecycleListener);
		connector.findLifecycleListeners();
		connector.removeLifecycleListener(lifecycleListener);
		connector.init();
		connector.start();
		connector.stop();
		connector.destroy();
		connector.getState();
		connector.getStateName();
	}

	private Connector getConnector() {
		return null;
	}

}
