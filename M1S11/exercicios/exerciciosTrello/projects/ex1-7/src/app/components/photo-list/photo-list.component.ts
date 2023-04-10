import { Component } from '@angular/core';

@Component({
  selector: 'app-photo-list',
  templateUrl: './photo-list.component.html',
  styleUrls: ['./photo-list.component.scss']
})
export class PhotoListComponent {
  arrayFotos: any = [
    {
      url: "https://i9.ytimg.com/vi_webp/h63t8R3MoNk/mqdefault.webp?v=6027e82b&sqp=COyf4pwG&rs=AOn4CLD2mFMPd59uY7pgYL3yNS4fd2vQzw",
      description:"Eu com meus amigos na praia."
    },
    {
      url: "https://i9.ytimg.com/vi_webp/36qFVbrfh40/mqdefault.webp?v=5fdb92bd&sqp=CJii4pwG&rs=AOn4CLAd84UoL0cTUKjoLKxXFkhpWAW0tw",
      description:"A força da Pantera."
    },
    {
      url: "https://i9.ytimg.com/vi/TAov5YjEiWo/mqdefault.jpg?v=5fd606af&sqp=CJii4pwG&rs=AOn4CLDED8U7qgwu_GSoB4OegA4nwItMcw",
      description:"Man vs Food."
    },
    {
      url: "https://i9.ytimg.com/vi_webp/gWuUYsCHf88/mqdefault.webp?v=5f79f05f&sqp=CJii4pwG&rs=AOn4CLDc1kvOXiT6GawCZyFsVoR3SbvzZw",
      description:"Refrescando na tundra."
    },
    {
      url: "https://i9.ytimg.com/vi_webp/GdW80U4ifiU/mqdefault.webp?v=60dc5c80&sqp=COyf4pwG&rs=AOn4CLCNR5rrep9MjTfQoZuYB0MwHjSehw",
      description:"Lembre sempre de beber água."
    }
  ]
}
