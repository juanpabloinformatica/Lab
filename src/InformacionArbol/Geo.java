/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InformacionArbol;

/**
 *
 * @author JPPM
 */
class Geo {
    float lat;
    float lng;

    public Geo(float lat, float lng) {
        this.lat = lat;
        this.lng = lng;
    }
    
    public float getLat() {
        return lat;
    }

    public void setLat(float lat) {
        this.lat = lat;
    }

    public float getLng() {
        return lng;
    }

    public void setLng(float lng) {
        this.lng = lng;
    }
    
}
