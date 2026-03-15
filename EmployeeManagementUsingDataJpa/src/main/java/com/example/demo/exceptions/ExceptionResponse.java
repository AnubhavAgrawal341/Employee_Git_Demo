package com.example.demo.exceptions;

import java.time.LocalDate;

public class ExceptionResponse {
		private String errorMessage;
		private LocalDate dateofException;
		private int stateCode;
		public String getErrorMessage() {
			return errorMessage;
		}
		public void setErrorMessage(String errorMessage) {
			this.errorMessage = errorMessage;
		}
		public LocalDate getDateofException() {
			return dateofException;
		}
		public void setDateofException(LocalDate dateofException) {
			this.dateofException = dateofException;
		}
		public int getStateCode() {
			return stateCode;
		}
		public void setStateCode(int stateCode) {
			this.stateCode = stateCode;
		}
		public ExceptionResponse(String errorMessage, LocalDate dateofException, int stateCode) {
			super();
			this.errorMessage = errorMessage;
			this.dateofException = dateofException;
			this.stateCode = stateCode;
		}
		
}
