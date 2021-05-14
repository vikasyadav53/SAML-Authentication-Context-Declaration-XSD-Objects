package com.vikas.saml.auth_declaration_context;

public class AsymmetricDecryption {
	private String[] Extension;

	private String keyValidation;

	public String[] getExtension() {
		return Extension;
	}

	public void setExtension(String[] Extension) {
		this.Extension = Extension;
	}

	public String getKeyValidation() {
		return keyValidation;
	}

	public void setKeyValidation(String keyValidation) {
		this.keyValidation = keyValidation;
	}

	@Override
	public String toString() {
		return "ClassPojo [Extension = " + Extension + ", keyValidation = " + keyValidation + "]";
	}
}
