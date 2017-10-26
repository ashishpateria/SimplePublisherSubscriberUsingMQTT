package pubSubBuilderFinal.gui;

import java.util.ArrayList;

import pubSubBuilderFinal.publisher.types.Publisher;
import pubSubBuilderFinal.subscriber.Subscriber;
/**
 * @author Yash Divecha 
 */

public class Result {

	private ArrayList<String> device1SelectedTopics;
	private ArrayList<String> device2SelectedTopics;
	private ArrayList<String> device3SelectedTopics;
	private ArrayList<String> device4SelectedTopics;

	private boolean isDevice1PubConfigured;
	private boolean isDevice2PubConfigured;
	private boolean isDevice3PubConfigured;
	private boolean isDevice4PubConfigured;

	private ArrayList<Publisher> device1PublishersSelected;
	private ArrayList<Publisher> device2PublishersSelected;
	private ArrayList<Publisher> device3PublishersSelected;
	private ArrayList<Publisher> device4PublishersSelected;

	private Subscriber sub1;
	private Subscriber sub2;
	private Subscriber sub3;
	private Subscriber sub4;

	public Subscriber getSub1() {
		return sub1;
	}

	public void setSub1(Subscriber sub1) {
		this.sub1 = sub1;
	}

	public Subscriber getSub2() {
		return sub2;
	}

	public void setSub2(Subscriber sub2) {
		this.sub2 = sub2;
	}

	public Subscriber getSub3() {
		return sub3;
	}

	public void setSub3(Subscriber sub3) {
		this.sub3 = sub3;
	}

	public Subscriber getSub4() {
		return sub4;
	}

	public void setSub4(Subscriber sub4) {
		this.sub4 = sub4;
	}

	public ArrayList<Publisher> getDevice1PublishersSelected() {
		return device1PublishersSelected;
	}

	public void setDevice1PublishersSelected(ArrayList<Publisher> device1PublishersSelected) {
		this.device1PublishersSelected = device1PublishersSelected;
	}

	public ArrayList<Publisher> getDevice2PublishersSelected() {
		return device2PublishersSelected;
	}

	public void setDevice2PublishersSelected(ArrayList<Publisher> device2PublishersSelected) {
		this.device2PublishersSelected = device2PublishersSelected;
	}

	public ArrayList<Publisher> getDevice3PublishersSelected() {
		return device3PublishersSelected;
	}

	public void setDevice3PublishersSelected(ArrayList<Publisher> device3PublishersSelected) {
		this.device3PublishersSelected = device3PublishersSelected;
	}

	public ArrayList<Publisher> getDevice4PublishersSelected() {
		return device4PublishersSelected;
	}

	public void setDevice4PublishersSelected(ArrayList<Publisher> device4PublishersSelected) {
		this.device4PublishersSelected = device4PublishersSelected;
	}

	public boolean isDevice1PubConfigured() {
		return isDevice1PubConfigured;
	}

	public void setDevice1PubConfigured(boolean isDevice1PubConfigured) {
		this.isDevice1PubConfigured = isDevice1PubConfigured;
	}

	public boolean isDevice2PubConfigured() {
		return isDevice2PubConfigured;
	}

	public void setDevice2PubConfigured(boolean isDevice2PubConfigured) {
		this.isDevice2PubConfigured = isDevice2PubConfigured;
	}

	public boolean isDevice3PubConfigured() {
		return isDevice3PubConfigured;
	}

	public void setDevice3PubConfigured(boolean isDevice3PubConfigured) {
		this.isDevice3PubConfigured = isDevice3PubConfigured;
	}

	public boolean isDevice4PubConfigured() {
		return isDevice4PubConfigured;
	}

	public void setDevice4PubConfigured(boolean isDevice4PubConfigured) {
		this.isDevice4PubConfigured = isDevice4PubConfigured;
	}

	Result() {
		device1SelectedTopics = new ArrayList<>();
		device2SelectedTopics = new ArrayList<>();
		device3SelectedTopics = new ArrayList<>();
		device4SelectedTopics = new ArrayList<>();
		isDevice1PubConfigured = false;
		isDevice2PubConfigured = false;
		isDevice3PubConfigured = false;
		isDevice4PubConfigured = false;
	}

	public ArrayList<String> getDevice1SelectedTopics() {
		return device1SelectedTopics;
	}

	public void setDevice1SelectedTopics(ArrayList<String> device1SelectedTopics) {
		this.device1SelectedTopics = device1SelectedTopics;
	}

	public ArrayList<String> getDevice2SelectedTopics() {
		return device2SelectedTopics;
	}

	public void setDevice2SelectedTopics(ArrayList<String> device2SelectedTopics) {
		this.device2SelectedTopics = device2SelectedTopics;
	}

	public ArrayList<String> getDevice3SelectedTopics() {
		return device3SelectedTopics;
	}

	public void setDevice3SelectedTopics(ArrayList<String> device3SelectedTopics) {
		this.device3SelectedTopics = device3SelectedTopics;
	}

	public ArrayList<String> getDevice4SelectedTopics() {
		return device4SelectedTopics;
	}

	public void setDevice4SelectedTopics(ArrayList<String> device4SelectedTopics) {
		this.device4SelectedTopics = device4SelectedTopics;
	}

}
